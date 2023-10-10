package ua.com.studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		System.out.print("Enter number of new students to enroll: ");
		try(Scanner in = new Scanner(System.in)){
		
			int numberOfStudent = in.nextInt();
			Student[] students = new Student[numberOfStudent];
	
			for(int i = 0; i < numberOfStudent; i++) {
				students[i] = new Student();
				students[i].enroll();
				students[i].payTuition();
				System.out.println();
			}
			
			for (int k = 0; k < numberOfStudent; k++) 
				System.out.println(students[k].toString() + "\n-------------------");
			
		}
		
	}

}
