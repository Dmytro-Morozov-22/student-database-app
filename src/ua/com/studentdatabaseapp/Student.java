package ua.com.studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuituonBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	public Student() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student first name: ");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = sc.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\n" + 
				"Enter student class level: ");
		this.gradeYear = sc.nextInt();
		
		
		sc.close();
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
	}
	
	//Generate an ID
	private void setStudentID() {
		//Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
}
