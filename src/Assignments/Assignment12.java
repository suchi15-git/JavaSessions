package Assignments;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1. Take three numbers from the user and print the greatest number. 
		Test Data
		Input the 1st number: 25 
		Input the 2nd number: 78 
		Input the 3rd number: 87
		Expected Output :
		The greatest: 87
		*/

		Scanner sc= new Scanner(System.in);
		System.out.println("Input the 1st number:");
		int a= sc.nextInt();
		
		System.out.println("Input the 2nd number:");
		int b= sc.nextInt();
		
		System.out.println("Input the 3rd number:");
		int c= sc.nextInt();
		
		if(a>b&&a>c) {
			System.out.println("A is largest");
		}
		
		else if (b>c && b>a) {
			System.out.println("B is largest");
		}
		
		else {
			System.out.println("C is largest");
		}
		
		
	}

}
