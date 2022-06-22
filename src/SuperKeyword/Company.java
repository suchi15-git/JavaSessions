package SuperKeyword;

public class Company extends Country {
	
	int salary=100;
	
	public void holiday() {
		System.out.println("This is my company holiday");
	}
	
	
	public Company() {
		super();
		System.out.println("Company default cons...");
	}

	public Company(int a) {
		System.out.println("Company default cons..." +a);
	}
	
	public Company(int a, int b) {
		System.out.println("Company default cons..." +a+b);
	}
}
