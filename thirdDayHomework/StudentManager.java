package thirdDayHomework;

public class StudentManager extends UserManager { // Bu Class'a UserManager'a ait metodlar extends ( inheritance ) edilerek miras býrakýlmýþtýr.
	
	// Bu Class'a Student Class'ý ile ilgili metodlar girilir.
	
	// Bu Class'ta UserManager'a ait yani miras býrakýlan metodlar dýþýnda ayný ismi taþýyan ek bir metod yazýlýrsa mirasý çiner ve bu Class'taki metodu çalýþtýrýr.
	
	public void login(Student student) {
		System.out.println("Öðrenci giriþ bilgileri...");
		System.out.println("Kullanýcý : " + student.getName() + " "+ student.getLastName());
		System.out.println("Kullanýcý adý : " + student.getUserName());
		System.out.println("Kullanýcý no : " + student.getId());
		System.out.println("Mail : " + student.getEmail());
		System.out.println("Parola : " + student.getPassword());
		System.out.println("Kamp ilerleme yüzdesi : " + "%" + student.getPrecentageOfCompletion());
	}
	
	public void update(Student student) {
		System.out.println(student.getPassword());
	}

}
