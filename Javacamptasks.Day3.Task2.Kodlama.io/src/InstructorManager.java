import java.util.ArrayList;
import java.util.List;

public class InstructorManager extends UserManager {
	List<Instructor> instructors = new ArrayList<Instructor>();
	
	public List<Instructor> getAll() {
		return instructors;
	}
}
