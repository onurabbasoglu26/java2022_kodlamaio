package homework_3.entities;

public class Course {

	private int id;
	private String courseName;
	private double coursePrice;
	private Category category;

	public Course() {

	}

	public Course(int id, String courseName, double coursePrice, Category category) {

		this.id = id;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.category = category;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
