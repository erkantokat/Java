package �kinciG�n�dev;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----KURSLAR----");
		
		Course course1 = new Course (
				1,
				"Programlamaya Giri� ��in Temel Kurs ( PYTHON )",
				"Engin DEM�RO�",
				"Canl� ders, canl� derse �m�r boyu eri�im, ders sonu �devler ve Linkedln'da payla��larak i� bulabilme.",
				"BELE�"
				);
		//lesson1.id = 1;
		//lesson1.name = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� ( C# + ANGULAR )";
		//lesson1.teacher ="Engin DEM�RO�";
		//lesson1.detail = "Canl� ders, canl� derse �m�r boyu eri�im, ders sonu �devler ve Linkedln'da payla��larak i� bulabilme.";
		//lesson1.unitPrice = "BELE�";
		
		
		Course course2 = new Course (
				2,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� ( C# + ANGULAR )",
				"Engin DEM�RO�",
				"Canl� ders, canl� derse �m�r boyu eri�im, ders sonu �devler ve Linkedln'da payla��larak i� bulabilme.",
				"BELE�"
				
				);
		
		
		Course course3 = new Course (
				3,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� ( JAVA + REACT )",
				"Engin DEM�RO�",
				"Canl� ders, canl� derse �m�r boyu eri�im, meslek hakk�nda detaylar, g�n sonu �devleri ve Linkedln'da payla��larak i� bulabilme.",
				"BELE�"
				);
		
		
		Course[] courses = {course1,course2, course3};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		System.out.println("Toplam kurs adeti : "+ courses.length);
		System.out.println("***************************************************************************");
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.register(course1);
		System.out.println("***************************************************************************");
		
		courseManager.register(course2);
		System.out.println("***************************************************************************");
		
		courseManager.register(course3);
		System.out.println("***************************************************************************");
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
