package javaKodlama;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Dua","Lipa","email1","abcd");
		User user2 = new User(2,"Ariana","Grande","email2","efgh");
		User user3 = new User(3,"Shawn","Mendes","email3","ijkl");
		
		Instructor instructor = new Instructor(user1,1);
		
		Student student = new Student(user2,2);
		
		UserManager userManager = new UserManager();
		
		InstructorManager instructorManager = new InstructorManager();
		
		StudentManager studentManager = new StudentManager();
		
		userManager.add(user3);
		userManager.add(user2);
		userManager.add(user1);
		userManager.delete(user1);
		userManager.delete(student);
		userManager.delete(instructor);
		System.out.println("***************************************");
		instructorManager.add(instructor);
		instructorManager.add(student);
		instructorManager.add(user3);
		instructorManager.delete(user1);
		instructorManager.delete(user2);
		instructorManager.delete(user3);
		System.out.println("***************************************");
		studentManager.add(user3);
		studentManager.add(student);
		studentManager.add(instructor);
		studentManager.delete(user1);
		studentManager.delete(student);
		studentManager.delete(instructor);
		
		

	}

}
