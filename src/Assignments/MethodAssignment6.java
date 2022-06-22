package Assignments;

import java.util.Scanner;

public class MethodAssignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote. */

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
		int age = sc.nextInt();
		
		voterIDAge(age);
	}
	
	public static void voterIDAge(int age) {
		if(age>=18) {
			System.out.println("Person is eligible for voting");
		}
		else {
			System.out.println("Person is not eligible for voting");
		}
		
		
	}

}
