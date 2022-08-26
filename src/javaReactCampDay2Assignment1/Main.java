package javaReactCampDay2Assignment1;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1,"Zeynep","Kaya","zynkaya@gmail.com","15041055541","12345");
		
		Student student2 = new Student(2,"Ahmet","Kaya","ahmtkaya@gmail.com","15041055542","12345");
		
		Course course1 = new Course(1,"Java","Engin Demiroğ","Java Kursu","50%");
		
		Course course2 = new Course(2,"C#","Engin Demiroğ","C# Kursu","80%");
		
		
		Course[] courses = {course1,course2};
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerToCourse(student1, course1);
		
		
		
	}

}
