package homework_3.dataAccess;

import homework_3.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {

		System.out.println("Added to database with JDBC.");

	}

}
