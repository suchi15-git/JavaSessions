package OOPS_Inheritance;

public class BMW extends Car {
	
	@Override
	public void start() {
		System.out.println("BMW start...");
	}

	public void autopark() {
		System.out.println("BMW autopark method...");
	}
}
