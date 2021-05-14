package İkinciGünÖdev;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----KURSLAR----");
		
		Course course1 = new Course (
				1,
				"Programlamaya Giriþ İçin Temel Kurs ( PYTHON )",
				"Engin DEMÝROÐ",
				"Canlı ders, canlı derse ömür boyu eriþim, ders sonu ödevler ve Linkedln'da paylaþýlarak iş bulabilme imkanı sağlar.",
				"BELEŞ"
				);
		//lesson1.id = 1;
		//lesson1.name = "Yazýlým Geliþtirici Yetiþtirme Kampý ( C# + ANGULAR )";
		//lesson1.teacher ="Engin DEMÝROÐ";
		//lesson1.detail = "Canlý ders, canlý derse ömür boyu eriþim, ders sonu ödevler ve Linkedln'da paylaþýlarak iþ bulabilme.";
		//lesson1.unitPrice = "BELEÞ";
		
		
		Course course2 = new Course (
				2,
				"Yazýlým Geliþtirici Yetiþtirme Kampý ( C# + ANGULAR )",
				"Engin DEMÝROÐ",
				"Canlý ders, canlý derse ömür boyu eriþim, ders sonu ödevler ve Linkedln'da paylaþýlarak iþ bulabilme.",
				"BELEŞ"
				
				);
		
		
		Course course3 = new Course (
				3,
				"Yazýlým Geliþtirici Yetiþtirme Kampý ( JAVA + REACT )",
				"Engin DEMÝROÐ",
				"Canlý ders, canlý derse ömür boyu eriþim, meslek hakkýnda detaylar, gün sonu ödevleri ve Linkedln'da paylaþýlarak iþ bulabilme.",
				"BELEŞ"
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
