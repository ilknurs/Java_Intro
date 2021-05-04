package javaKodlama;

public class Student extends User {

	private int studentNo;

	public Student(User user, int studentNo) {
		super(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
		this.studentNo = studentNo;
	}

	public Student() {

	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

}
