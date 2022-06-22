package Assignments;

import java.util.Scanner;

public class MethodAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
		 * Area = πr2
		 * circumference=2πr
		 */
		

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter radius of circle:");
		int radius = sc.nextInt();
		
		circumference(radius);
		
		area(radius);
		
		

	}
	
	public static void circumference(int radius) {	
		double circum = 2*3.14*radius;
		System.out.println(circum);
	}
	
	public static void area(int radius) {	
		double circleArea = 3.14*radius*radius;
		System.out.println(circleArea);
		
	}

}
