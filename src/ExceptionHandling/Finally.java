package ExceptionHandling;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int i= 9/0;
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("AE is coming..");
		}
		
		finally {
			System.out.println("Finally is printed...");
		}
	}

}
