package Assignments;

import java.util.Scanner;

public class MethodAssignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Define a program to find out whether a given number is even or odd. */
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		oddEvenNumber(num);

	}
	
	public static void oddEvenNumber(int a) {
		
		if(a%2==0) {
			System.out.println("Its even number:" +a);
		}
		
		else {
			System.out.println("Its odd number:" +a);
		}
		
		
	}

}
