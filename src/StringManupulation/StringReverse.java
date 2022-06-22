package StringManupulation;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseString("selenium"));
		System.out.println(reverseString("m"));
		System.out.println(reverseString("101"));
		System.out.println(reverseString(null));
		
		System.out.println(palindromeString("madam"));

	}
	
	public static boolean palindromeString(String s) {
		if (s.equals(reverseString(s))) {
		return true;
		}
		else {
			return false;
		}
	}
	
	public static String reverseString(String s) {
		
		if(s==null) {
			System.out.println("Please enter valid string");
			return null;
		}
		
		if(s.length()==1) {
			System.out.println(s);
			return s;
		}
		
		String reverse= "";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			reverse = reverse +s.charAt(i);
			
		}
		return reverse;
	}

}
