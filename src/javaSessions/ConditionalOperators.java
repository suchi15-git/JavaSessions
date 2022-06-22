package javaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		System.out.println(a > b);

		if (a > b) {
			System.out.println("a is greater than b");
		}

		else {
			System.out.println("b is greater than a");
		}

		if (true) {
			System.out.println("Hi");
		}

		else {
			System.out.println("bye!");
		}

		// here we didnt get notification of dead code as boolean flag will be going to
		// change in the future
		boolean flag = true;
		if (flag) {
			System.out.println("JAVA");

		} else {
			System.out.println("PYTHON");
		}

		// nested ifs
		int marks = 101;
		if (marks <= 100) {
			System.out.println("A grade");
			if (marks >= 95) {
				System.out.println("A++ Grade");
			} else {
				System.out.println("A Grade");
			}
		} else {
			System.out.println("Wrong marks!");
		}
		
		//comparator operator for primitive data types
		int p =10;
		int q= 10;
		if(p==q) {
			System.out.println("HELLO");
		}
		
		//string is non-primitive data type
		// the problem with this code is that it will keep checking each condition and then move to else. To improve this code use "if else if" condition
	
//		String name ="Tom";
//		if(name.equals("Harsg")) {
//			System.out.println("Harsh got 100 marks");
//		}
//		if(name.equals("Suchita")) {
//			System.out.println("Suchita got 90 marks");
//		}
//		if(name.equals("Naveen")) {
//			System.out.println("Naveen got 80 marks");
//		}
//		
//		else {
//			System.out.println("Student not found");
//		}
		
		String name ="Tom";
		if(name.equals("Harsg")) {
			System.out.println("Harsh got 100 marks");
		}
		else if(name.equals("Suchita")) {
			System.out.println("Suchita got 90 marks");
		}
		else if(name.equals("Naveen")) {
			System.out.println("Naveen got 80 marks");
		}
		
		else {
			System.out.println("Student not found");
		}
		
		
		if (true)
		{
			System.out.println("Execute the true statement");
		} else {
			System.out.println("Execute the false statement");
		}

	}

}
