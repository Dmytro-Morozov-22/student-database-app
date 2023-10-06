package ua.com.studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private String courses;
	private int tuituonBalance;
	private int costOfCourse = 600;
	
	public Student() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student first name: ");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = sc.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\n" + 
				"Enter student class level: ");
		this.gradeYear = sc.nextInt();
		System.out.println(firstName + " " + lastName + " " + gradeYear);
		
		sc.close();
	}
}
