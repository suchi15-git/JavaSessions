package Assignments;

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print 0-10 numbers
		int i=0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		//print multiple of 5
		int constant=5;
		int j=1;
		while( j<=100) {
			System.out.print(constant*j +" ");
			j++;
		}
		
		//print factorial program for 5
		int fact=1;
		int num =6;
		int b=1;
		while(b<=num) {
			fact=fact*b;		
			b++;
		}
		System.out.println(fact);
	}

}
