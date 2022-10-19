package homework_3.business;

import homework_3.dataAccess.CategoryDao;
import homework_3.entities.Category;
import homework_3.logging.Logger;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	private Category[] categories;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void addCategory(Category category) throws Exception  {
		for (Category currentCategory : categories) {
			if (currentCategory != category) {
				if (currentCategory.getCategoryName() == category.getCategoryName()) {
					throw new Exception("Caterories name already exist");
				}
			}
		}

		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		System.out.println();
	}

}
