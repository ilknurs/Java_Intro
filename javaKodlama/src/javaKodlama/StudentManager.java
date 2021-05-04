package javaKodlama;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println("Student has been added. "+user.getFirstName());
	}
	
	public void delete(User user) {
		System.out.println("Student has been deleted. "+user.getId());
	}

}
