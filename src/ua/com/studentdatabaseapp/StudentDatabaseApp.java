package ua.com.studentdatabaseapp;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Student st = new Student();
		st.enroll();
		st.payTuition();
		System.err.println(st.toString());

	}

}
