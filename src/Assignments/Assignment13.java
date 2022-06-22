package Assignments;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2. Write a Java program to test a number is positive or negative.
		Test Data
		Input number: 35 -- positive number
		Input number: -11 -- negative number
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Input number:");
		int a= sc.nextInt();
		
		if(a>0) {
			System.out.println("Positive number");
		}
		
		else if(a<0) {
			System.out.println("Negative number");
		}

	}

}
