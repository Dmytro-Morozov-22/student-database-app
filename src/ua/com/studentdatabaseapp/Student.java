package ua.com.studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "Not enrolled to any";
	private int tuituonBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	private Scanner sc = new Scanner(System.in);
	
	public Student() {		
		this.firstName = addFieldValue("Enter student first name: ");
		this.lastName = addFieldValue("Enter student last name: ");
		this.gradeYear = Integer.valueOf(addFieldValue("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\n" + 
				"Enter student class level: "));
		setStudentID();
	}
	
	//Initializes fields from console
	private String addFieldValue(String descriptionField) {
		System.out.print(descriptionField);
			return sc.nextLine();
	}
	
	//Generate an ID
	private void setStudentID() {
		//Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			String course = sc.nextLine();
			if(!course.equals("Q")) {
				this.courses = courses.equals("Not enrolled to any") ? "\n  " + course : courses + "\n  " + course;
				this.tuituonBalance = tuituonBalance + costOfCourse;
			} else {
				break;
			}	
		} while(true);
	}
	
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is: " + this.tuituonBalance);
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: ");
		int payment = sc.nextInt();
		this.tuituonBalance = tuituonBalance - payment;
		System.out.println("Thank you for your payment of " + payment);
		viewBalance();
	}
	
	public String toString() {
		return "Name: " + this.firstName + " " + this.lastName +
				"\nGrade Level: " + this.gradeYear +
				"\nStudent ID: " + this.studentID +
				"\nCourse Enrolled: " + this.courses +
				"\nBalance: " + this.tuituonBalance;
	}	
}
