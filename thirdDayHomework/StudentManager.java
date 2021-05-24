package thirdDayHomework;

public class StudentManager extends UserManager { // Bu Class'a UserManager'a ait metodlar extends ( inheritance ) edilerek miras b�rak�lm��t�r.
	
	// Bu Class'a Student Class'� ile ilgili metodlar girilir.
	
	// Bu Class'ta UserManager'a ait yani miras b�rak�lan metodlar d���nda ayn� ismi ta��yan ek bir metod yaz�l�rsa miras� �iner ve bu Class'taki metodu �al��t�r�r.
	
	public void login(Student student) {
		System.out.println("��renci giri� bilgileri...");
		System.out.println("Kullan�c� : " + student.getName() + " "+ student.getLastName());
		System.out.println("Kullan�c� ad� : " + student.getUserName());
		System.out.println("Kullan�c� no : " + student.getId());
		System.out.println("Mail : " + student.getEmail());
		System.out.println("Parola : " + student.getPassword());
		System.out.println("Kamp ilerleme y�zdesi : " + "%" + student.getPrecentageOfCompletion());
	}
	
	public void update(Student student) {
		System.out.println(student.getPassword());
	}

}
