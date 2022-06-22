package SuperKeyword;

public class Employee extends Company{
	
	int salary =50;
	
	public void getSalary() {
		System.out.println(super.salary);
		System.out.println(salary);
	}
	
	public void holiday() {
		super.holiday();
		System.out.println("This is my employee holiday");
	}
	
	
	public Employee() {
		super();
		System.out.println("employee class const...");
	}

	public Employee(int a) {
		super(10);
		System.out.println("employee class const..." +a);
	}
	
	public Employee(int a , int b) {
		super(10,20);
		System.out.println("employee class const..." +a+b);
	}
}
