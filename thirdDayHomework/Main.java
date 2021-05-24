package thirdDayHomework;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(0, null, null, null, null, null, 0);
		student1.setId(1);
		student1.setName("Erkan");
		student1.setLastName("TOKAT");
		student1.setUserName("e.t.x");
		student1.setEmail("eett.10@hotmail.com");
		student1.setPassword("00a1b2c3d4e5");
		student1.setPrecentageOfCompletion(25);
		
		
		Instructor instructor1 = new Instructor(0, null, null, null, null, null);
		instructor1.setId(1);
		instructor1.setName("Engin");
		instructor1.setLastName("DEMÝROÐ");
		instructor1.setEmail("mail");
		instructor1.setUserName("E.D");
		instructor1.setCourseName("Java + React");
		
		
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.login(student1);
		
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor1);
		instructorManager.loadToHomework(instructor1);
		
		
		
		
		
		
	}

}
