package Assignments;

import java.util.ArrayList;

public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a Java program to create a new array list, add some colors (string) and print out the collection
		 */
		
		ArrayList <String> arr = new ArrayList<String>();
		arr.add("Red");
		arr.add("Black");
		arr.add("Yellow");
		
		System.out.println(arr);
		
		for(String color:arr) {
			System.out.println(color);
		}
		
	}

}
