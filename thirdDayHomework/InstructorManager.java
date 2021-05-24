package thirdDayHomework;

public class InstructorManager extends UserManager{

	public void login(Instructor instructor) {
		System.out.println("Eðitmen giriþ bilgileri...");
		System.out.println("Eðitmen : " + instructor.getName() + " " + instructor.getLastName());
		System.out.println("Eðitmen kullanýcý adý . " + instructor.getUserName());
		System.out.println("Admin no : " + instructor.getId());
		System.out.println("Eðitmen mail : " + instructor.getEmail());
		System.out.println("Eðitim adý : " + instructor.getCourseName());
	}
	
	public void loadToHomework(Instructor instructor) {
		System.out.println("Ödev yüklendi.");
		
	}
	
	
	
	
	
	

}
