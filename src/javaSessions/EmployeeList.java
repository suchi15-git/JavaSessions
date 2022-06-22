package javaSessions;

import java.util.ArrayList;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList(5);
		//vc=5 , pc=0
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add(100);
		ar.add(100);
		ar.add(100);
		ar.add(100);
		
		//li =0
		//hi = size-1 =5-1=4
		
		ar.add(600); //5
		System.out.println(ar.size());
		
		ar.add(700); //6
		System.out.println(ar.size());
		
		ar.add(800); //7
		System.out.println(ar.size());
		
		//print all the values from the arraylist
		
		for(int i=0;i<ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println(ar);
	}

}
