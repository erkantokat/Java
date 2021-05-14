package İkinciGünÖdev;

public class CourseManager {
	public void register (Course course) {
		System.out.println("Katılınılan Kurs : "+course.name);
		System.out.println("Eğitmen : " + course.teacher);
		System.out.println("Detay : " + course.detail);
		System.out.println("Ücret : " + course.unitPrice);

	}	
}
