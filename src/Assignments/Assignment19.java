package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Assignment19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr = {10,20,30,40,50};
		reverseArray(arr);

	}
	
	 static void reverseArray(Integer [] a) {
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}

}
