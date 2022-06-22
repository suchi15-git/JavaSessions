package MethodConcepts;

public class MainMethodOverloading {
	
	//we can overload main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		
		main(10);
		main(10,10);

	}
	
	public static void main(int a) {
		System.out.println("hi");
		
	}

	public static void main(int a, int b) {
		System.out.println("hello");
	}
}
