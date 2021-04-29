package javaOdev;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course("C# - Angular", "Yaz�l�m Geli�tirici Yeti�tirme Kamp�");
		Course course2 = new Course("Java - React", "Yaz�l�m Geli�tirici Yeti�tirme Kamp�");

		Course[] courses = { course1, course2 };
		for (Course course : courses) {
			System.out.println("Kurs Ad�: " + course.name);
		}

		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);

	}
}
