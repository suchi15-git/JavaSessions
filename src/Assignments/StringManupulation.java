package Assignments;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringEquality("Suchita", "Suchita");
		
		String output=StringspaceRemoval("         Hello      Everyone       ");
		System.out.println(output);
		
		printStringFirstandLast("Suchita");
		
		//Write a program to verify a word or a character contained in the sentence.
		String s1= "Himalaya";
		System.out.println(s1.contains("alaya"));
		
		System.out.println(StringReverse("a"));
		
		System.out.println(lastHalfString("Suchitaa"));

		
		//System.out.println(thirdCharOccurence("suete"));
		
		System.out.println(ContainsString("Suchita is hell busy"));
	}

	
	public static void StringEquality(String s1, String s2) {
		
		if(s1.equals(s2)) {
			System.out.println("Both the strings are equal");
		}
		else {
			System.out.println("Both strings are not equal");
		}
	}
	
	public static String StringspaceRemoval(String s1) {
		
		String updatedS1= s1.replace(" ", "");
		return updatedS1;
		
	}
	
	//Write a program that will  print out the last character and first character of a word.
	public static void printStringFirstandLast(String s1) {
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(s1.length()-1));
		
	}
	
	//Write a function/ method to reverse your own name.
	public static String StringReverse(String s1) {
		
		if(s1==null) {
			System.out.println("Please enter valid string");
		}
		
		else if (s1.length()==1) {
			System.out.println(s1);
		}
			
		String reverse = "";
		
		for (int i= s1.length()-1;i>=0;i--) {
			reverse = reverse + s1.charAt(i);		
		
		}
		
		return reverse;	
	}
	
	//Write a program that gives you the last half of the string.
	
	public static String lastHalfString(String s1) {
		
		String lasthalf= "";
		
		for (int i =(s1.length()-1)/2 ;i<=s1.length()-1;i++) {
			lasthalf = lasthalf + s1.charAt(i);
		}
		return lasthalf;
	}
	
	//Write a program to get the 3rd  “ e “ of the string .
	
//	public static int thirdCharOccurence(String s1) {
//		int in= s1.indexOf('e');
//		
//		for (int i=in;i<=s1.length()-1;i++) {
//			
//			int in1 =s1.charAt('e');
//		}
//		return in;
//	}
	
	//Write a method which gives an index of (-1) if string is not available. . it should return integer. 
	//if String is present, then it should return the specific index.
	
	public static int ContainsString(String s1) {
		 if(s1.contains("")) {
			 return s1.indexOf("hell");
		 }
		 
		 else {
			 return -1;
		 }
	}
	
	//Write a program that breaks a whole string into small strings, and prints out its all values

	public static void splitString(String s1) {
		
		s1.split(s1, 0);
		
	}
}
