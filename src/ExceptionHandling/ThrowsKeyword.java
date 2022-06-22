package ExceptionHandling;

public class ThrowsKeyword {
	
	public void m1() throws ArithmeticException{
		m2();
	}

	public void m2() throws ArithmeticException{
		
		try{
			m3();
			}
		
		catch(ArithmeticException e){
			System.out.println("AE is coming..");
			e.printStackTrace();
			
		}
	}
	
	public void m3() throws ArithmeticException{
		int i=9/0;
	}
	
	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();

		
		System.out.println("BYE");
	}

}
