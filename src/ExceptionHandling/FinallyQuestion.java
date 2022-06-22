package ExceptionHandling;

public class FinallyQuestion {
	
	
	public static int getMarks(String name) {
		System.out.println(name);
		
		if(name.equals("Tom")) {
			
			try {
				int i=9/0;
			}
			
			catch(ArithmeticException e) {
				return 60;
			}
		
			finally {
				return 70;
			}
			
		}
		else if(name.equals("peter")) {
			return 85;
		}
		else {
			return -1;
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m= getMarks("Tom");
		System.out.println(m);

	}

}
