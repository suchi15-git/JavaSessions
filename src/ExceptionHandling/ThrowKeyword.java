package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String data = null;
		
		if(data==null) {
			
			try {
			throw new Exception("DATA not found...");
			}
			catch(Exception e){
				e.printStackTrace();
				System.out.println("Data not found.....");
				
				try {
					int i =9/0;
				}
				
				catch(ArithmeticException e1) {
					e.printStackTrace();
					System.out.println("Some exception coming..");
				}
				
			}
		}

	}

}
