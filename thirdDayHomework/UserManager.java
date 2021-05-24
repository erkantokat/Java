package thirdDayHomework;

public class UserManager { // Bu class'ta User Class'ýna ait metodlar bulunur. Baþka bir Class'ta extends edilirse bu class'taki metodlar miras (inheritance) býrakýlýr. O Class'a da ait sayýlýr.
	
	// User Class'ý ile ilgili metodlarý burada gireriz.
	
	public void add(User user) {
		System.out.println("Yeni Öðrenci : " + user.getName()+ " "+ user.getLastName() + " eklendi.");
	}
	
	

	

}
