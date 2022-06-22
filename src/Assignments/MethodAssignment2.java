package Assignments;

import java.util.Scanner;

public class MethodAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2. Define a method that returns the product of two numbers entered by user.
		 */
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Print first number:");
		int a = sc.nextInt();
		System.out.println("Print second number:");
		int b = sc.nextInt();
		
		int product =multiplication(a,b);
		System.out.println(product);
		
	}

	public static int multiplication(int a , int b) {
		int c = a*b;
		return c;
	}
}
