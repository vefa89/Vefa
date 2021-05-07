package camp3Homework2;

public class Instructor extends User {

	private String instructorPackage;

	public Instructor(int id, String name, String eposta, String instructorPackage) {
		super(id, name, eposta);
		this.instructorPackage = instructorPackage;
	}

	public String getInstructorPackage() {
		return instructorPackage;
	}

	public void setInstructorPackage(String instructorPackage) {
		this.instructorPackage = instructorPackage;
	}

}
