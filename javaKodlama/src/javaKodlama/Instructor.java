package javaKodlama;

public class Instructor extends User {

	private int instructorNo;

	public Instructor(User user, int instructorNo) {
		super(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
		this.instructorNo = instructorNo;
	}

	public Instructor() {

	}

	public int getInstructorNo() {
		return instructorNo;
	}

	public void setInstructorNo(int instructorNo) {
		this.instructorNo = instructorNo;
	}

}
