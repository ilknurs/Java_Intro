package javaKodlama;

public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println("Instructor has been added."+user.getFirstName());
	}
	
	public void delete(User user) {
		System.out.println("Instructor has been deleted."+user.getId());
	}
}
