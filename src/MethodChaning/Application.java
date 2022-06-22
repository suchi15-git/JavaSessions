package MethodChaning;

public class Application {
	
	public void m1() {
		System.out.println("m1 method");
		m2();
		
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
	}
	
	public static void p1() {
		System.out.println("p1 method");
		Application a1 = new Application ();
		a1.p1();
		
	}
	
	public static void p2() {
		System.out.println("p2 method");
		
	}
	
	public static void p3() {
		System.out.println("p3 method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application app = new Application();
		app.m1();
		app.m2();
		app.m3();

	}

}
