package thirdDayHomework;

public class Instructor extends User { // Bu Class'a User'a ait field'lar extends ( inheritance ) edilerek miras býrakýlmýþtýr.
	

	private String courseName;
	

	public Instructor(int id, String name, String lastName, String userName, String email, String courseName) {
		super(id, name, lastName, userName, email);
		this.courseName = courseName;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	
	
	

}
