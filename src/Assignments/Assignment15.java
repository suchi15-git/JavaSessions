package Assignments;

import java.util.ArrayList;

public class Assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to insert an element into the array list at the first and last positions.
		
		ArrayList <Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		System.out.println(arr);
		
		arr.add(0,100);
		System.out.println(arr.size());
		System.out.println(arr);
		
		arr.add(arr.size(),200);
		System.out.println(arr);
		
		System.out.println(arr.size());

	}

}
