package Assignments;

import java.util.ArrayList;

public class Assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *6. Write a Java program to search an element in a array list.
		 */
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Suchita");
		names.add("Akshay");
		names.add("Pranita");
		names.add("Suresh");
		
		System.out.println(names);
		
		searchElement(names,"xyz");
	}

	public static void searchElement(ArrayList names , String name) {
		if(names.contains(name)) {
			System.out.println("Name is present in the list:" +name);
		}
		
		else {
			System.out.println("Name not found:" +name);
		}
	}
}
