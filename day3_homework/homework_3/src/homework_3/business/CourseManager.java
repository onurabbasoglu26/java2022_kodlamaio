package homework_3.business;

import homework_3.dataAccess.CourseDao;
import homework_3.entities.Course;
import homework_3.logging.Logger;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	private Course[] courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers, Course[] courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	public void addCourse(Course course) throws Exception {
		if(course.getCoursePrice() <= 0.0) {
			throw new Exception("Course price connot be 0 or negative number.");
		}
		
		for(Course currentCourse: courses) {
			if(currentCourse != course) {
				if(currentCourse.getCourseName() == course.getCourseName()) {
					throw new Exception("Course name already exist");
				}
			}
		}
		
				
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
		System.out.println();
	}

}
