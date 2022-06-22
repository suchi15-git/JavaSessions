package ExceptionHandling;

public class TryCatchBlock {
	
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock obj = null;
		
		
		try {
			
		int i =9/3;
		obj.name="Suchita";
		
		System.out.println("HI");
		System.out.println("HI");
		System.out.println("HI");
		
		}
		catch(ArithmeticException e){
			System.out.println("Some exception is coming");
			e.printStackTrace();
		}
		
		catch(NullPointerException e) {
			System.out.println("NPE is coming");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("E is coming");
			e.printStackTrace();
		}
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
	}

}
