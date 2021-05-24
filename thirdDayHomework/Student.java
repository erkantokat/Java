package thirdDayHomework;

public class Student extends User{ // Bu Class'ta User'a ait field'lar extends ( inheritance ) edilerek miras býrakýlmýþtýr.
	
	
	private String password;
	private int precentageOfCompletion; // Tamamlama yüzdesi
	
	
	public Student(int id, String name, String lastName, String userName, String email, String password, int precentageOfCompletion) {
		super(id, name, lastName, userName, email);
		this.password = password;
		this.precentageOfCompletion = precentageOfCompletion;
	}

	


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getPrecentageOfCompletion() {
		return precentageOfCompletion;
	}


	public void setPrecentageOfCompletion(int precentageOfCompletion) {
		this.precentageOfCompletion = precentageOfCompletion;
	}
	
	
	

	

}
