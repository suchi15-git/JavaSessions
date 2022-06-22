package javaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//default class - Array List is a class
		//Index/order based collection
		/* Here the size of the array is not defined
		 * by using add method, 100 will be assigned to the 0th index position
		 * 200 will be assigned to the 1st index position
		 *  
		 *  
		 *  */
		
		ArrayList ar = new ArrayList(20);
		/*pc = 20 , vc=0
		 20th index value vc = 20/2=10
		 pc=30, vc=30/2=15
		 pc=45, vc=45/2=22
		 */
		ar.add(100);
		ar.add(200);
		ar.size(); //find out the size of the array
		System.out.println(ar.size()); //2
		
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		
		//System.out.println(ar.get(4)); //array index out of bounds exception
		ar.add(500);
		System.out.println(ar.get(4));
		ar.add(8, 800);
		System.out.println(ar.get(5)); //array index out of bounds exception

	}

}
