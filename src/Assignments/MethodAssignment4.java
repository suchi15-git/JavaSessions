package Assignments;

public class MethodAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Define two methods to print the maximum and the minimum number respectively among three numbers entered by user. */

		compare(10,20,30);
		
	}
	
	public static void compare(int a , int b, int c) {
		
		if (a>b && a>c) {
			System.out.println("A is largest");
		}
		
		else if (b>a && b>c) {
			System.out.println("B is largest");
		}
		
		else {
			System.out.println("C is largest");
		}
	}
	

}
