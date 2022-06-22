package Assignments;

public class Assignment21 {

	static int fact =1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact1 =factorial(4);
		System.out.println(fact1);

	}

	
	public static int factorial(int num) {
		
		for (int i=0;i<=num;i++) {
			fact =num*fact;
			num--;
			
			
		}
		return fact;
	}
}
