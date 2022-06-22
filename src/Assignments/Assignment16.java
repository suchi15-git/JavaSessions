package Assignments;

import java.util.ArrayList;

public class Assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a Java program to retrieve an element (at a specified index) from a given array list.
		 */
		
		ArrayList <Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		System.out.println(arr.size());
		System.out.println(arr);
		
		arr.add(0, 100);
		System.out.println(arr);
		System.out.println(arr.size());
		
		arr.add(arr.size(), 200);
		System.out.println(arr);
		
		System.out.println(arr.get(5));

	}

}
