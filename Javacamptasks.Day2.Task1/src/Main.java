
public class Main {

	public static void main(String[] args) {
		Category category1 = new Category();
		CategoryManager categoryManager = new CategoryManager();
		
		Course course1 = new Course();
		CourseManager courseManager = new CourseManager();
		
		for (Course course : courseManager.getAll()) {
			System.out.println(course.getName());
		}
		
		for (Category category : categoryManager.getAll()) {
			System.out.println(category.getContent());
		}

	}

}
