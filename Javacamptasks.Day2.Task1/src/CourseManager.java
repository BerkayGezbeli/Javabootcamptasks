
public class CourseManager {
	public void add(Course course) {
		System.out.println(course.getName() + " : added.");
	}

	public void delete(Course course) {
		System.out.println(course.getName() + " : deleted.");
	}

	public void update(Course course) {
		System.out.println(course.getName() + " : updated.");
	}

	public Course[] getAll() {
		Course course1 = new Course(3, "Java");
		Course course2 = new Course(4, "C#");
		Course[] courses = { course1, course2 };
		
		return courses;
	}
}
