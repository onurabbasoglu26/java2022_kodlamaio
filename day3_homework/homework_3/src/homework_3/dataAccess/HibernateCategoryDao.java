package homework_3.dataAccess;

import homework_3.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {

		System.out.println("Added to database with Hibernate.");

	}

}
