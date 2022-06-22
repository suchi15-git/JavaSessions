package Assignments;

import java.util.ArrayList;

public class Assignment17 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 4. Write a Java program to update specific array element by given element.
		 * 5. Write a Java program to remove the third element from a array list. 
		 */
		
		
		
		
		ArrayList <Integer> arr = new ArrayList<Integer>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		
		arr.add(0, 1000);
		arr.add(arr.size(), 2000);

		System.out.println(arr);
		
		
//		for(int i=0;i<arr.size();i++) {
//			if(i==3) {
//				arr.remove(i);
//				arr.add(i,500);
//				
//				break;
//			}
//			
//			
//		}
//		System.out.println(arr);
//		
//	
		
		updateArray(arr,10,600);
		System.out.println(arr);
		
		
	}
	
	public static void updateArray(ArrayList<Integer> arr,int index ,int num ) {
		if(arr.size()-1 >index) {
			arr.remove(index);
			arr.add(index,num);
		}
		
		else {
			System.out.println("Enter correct index");
		}
	}

}
