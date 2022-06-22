package javaSessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int array
		
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println();
		int len = i.length;
		System.out.println(len);
		
		//print all the values in array
		
		for(int k=0;k<i.length;k++) {
			System.out.println(k+ ":" +i[k]);
		}
		
		//use for each loop
		
		System.out.println("--------------");
		int counter=0;
		
		for(int e : i) {		
			System.out.println(counter + ":" +e);
			counter++;
			
		}
		
		//double array
		
		double d[]= new double[2];
		d[0]=12.33;
		d[1]=13.22;
		
		//for loop
		
		for (double e:d) {
			System.out.println(e);
		}
		
		//char array
		char c[]= new char[3];
		c[0]='a';
		c[1]='3';
		c[2]='Z';
		
		System.out.println(c);
		System.out.println(Arrays.toString(c));
		
		for (char e:c) {
			System.out.println(e);
		}
		
		
		//array literals : we are aware that how many values will be there in array. it is static array only
		

	}

}
