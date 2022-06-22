package Assignments;

import java.util.Scanner;

public class MethodAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1.Write a program to print the sum of two numbers entered by user by defining your own method
		 */
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Print first number:");
		int a = sc.nextInt();
		System.out.println("Print second number:");
		int b = sc.nextInt();
		
		int addition =sum(a, b);
		System.out.println(addition);

	}
	
	public static int sum(int a, int b) {
		int c = a+b;
		return c;
		
	}

}
