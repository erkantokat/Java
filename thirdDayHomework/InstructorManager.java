package thirdDayHomework;

public class InstructorManager extends UserManager{

	public void login(Instructor instructor) {
		System.out.println("E�itmen giri� bilgileri...");
		System.out.println("E�itmen : " + instructor.getName() + " " + instructor.getLastName());
		System.out.println("E�itmen kullan�c� ad� . " + instructor.getUserName());
		System.out.println("Admin no : " + instructor.getId());
		System.out.println("E�itmen mail : " + instructor.getEmail());
		System.out.println("E�itim ad� : " + instructor.getCourseName());
	}
	
	public void loadToHomework(Instructor instructor) {
		System.out.println("�dev y�klendi.");
		
	}
	
	
	
	
	
	

}
