package javaKodlama;

public class UserManager {
	
	public void add(User user) {
		System.out.println("User has been added."+user.getFirstName());
	}
	
	public void delete(User user) {
		System.out.println("User has been deleted."+user.getId());
	}


}
