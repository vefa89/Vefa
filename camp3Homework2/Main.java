package camp3Homework2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1,"�gretim g�revlisi","abc@abc.com","Mat");
		Student student1 = new Student();
		student1.setName("�greinci");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor1);
		instructorManager.addLesson(instructor1);

		StudentManager studentManager = new StudentManager();
		studentManager.login(student1);
		studentManager.takeLessons(student1);
	}
}
