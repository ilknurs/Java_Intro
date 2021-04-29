package javaOdev;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course("C# - Angular", "Yazılım Geliştirici Yetiştirme Kampı");
		Course course2 = new Course("Java - React", "Yazılım Geliştirici Yetiştirme Kampı");

		Course[] courses = { course1, course2 };
		for (Course course : courses) {
			System.out.println("Kurs Adı: " + course.name);
		}

		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);

	}
}
