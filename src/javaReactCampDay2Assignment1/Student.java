package javaReactCampDay2Assignment1;

public class Student {
	
	public Student(int id, String firstName, String lastName, String email, String nationalID, String password
			) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.nationalID = nationalID;
		this.password = password;
		
	}
	int id;
    String firstName;
    String lastName;
    String email;
    String nationalID;
    String password;
	Image  profileImage;
	Course[] enrolledCourses;
}
