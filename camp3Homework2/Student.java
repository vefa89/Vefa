package camp3Homework2;

public class Student extends User {

	private String studentPackage;

	public Student() {
	}

	public Student(int id, String name, String eposta, String studentPackage) {
		super(id, name, eposta);
		this.studentPackage = studentPackage;
	}

	public String getStudentPackage() {
		return studentPackage;
	}

	public void setStudentPackage(String studentPackage) {
		this.studentPackage = studentPackage;
	}

}
