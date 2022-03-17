
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.id=1;
		student.firstName="Nebi";
		student.lastName="GÜL";
		student.nationalyId="12345678910";
		student.coursesId=new int[] {1,2,3};
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.firstName = "Engin";
		instructor.lastName = "Demirog";
		instructor.nationalyId= "01987654321";
		instructor.instructorsCoursesId = new int[] {3,2,1};
		
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);

	}

}
