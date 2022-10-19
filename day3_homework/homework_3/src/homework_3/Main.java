package homework_3;

import homework_3.business.CategoryManager;
import homework_3.business.CourseManager;
import homework_3.dataAccess.HibernateCategoryDao;
import homework_3.dataAccess.JdbcCourseDao;
import homework_3.entities.Category;
import homework_3.entities.Course;
import homework_3.logging.DatabaseLogger;
import homework_3.logging.FileLogger;
import homework_3.logging.Logger;
import homework_3.logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {

		Category category1 = new Category(1, "Programming");
		Category category2 = new Category(2, "Maths");
		Category category3 = new Category(3, "Data Science");


		Course course1 = new Course(1, "C", 29.90, category1);
		Course course2 = new Course(2, "C++", 19.90, category1);
		Course course3 = new Course(3, "Java", 120, category1);
		
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		Course[] courses = {course1, course2, course3};
		Category[] categories = {category1, category2, category3};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courses);

		for(Category category : categories) {
			categoryManager.addCategory(category);
		}

		
		for(Course course : courses) {			
			courseManager.addCourse(course);
		}

	}

}
