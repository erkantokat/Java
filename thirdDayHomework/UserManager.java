package thirdDayHomework;

public class UserManager { // Bu class'ta User Class'�na ait metodlar bulunur. Ba�ka bir Class'ta extends edilirse bu class'taki metodlar miras (inheritance) b�rak�l�r. O Class'a da ait say�l�r.
	
	// User Class'� ile ilgili metodlar� burada gireriz.
	
	public void add(User user) {
		System.out.println("Yeni ��renci : " + user.getName()+ " "+ user.getLastName() + " eklendi.");
	}
	
	

	

}
