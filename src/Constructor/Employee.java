package Constructor;

public class Employee {

	
	String name;
	int age;
	double salary;
	boolean isActive;
	String id;
	
	
//	public Employee() {
//		System.out.println("0 parameterized constructor");
//	}
	
	public Employee(int a) {
		System.out.println("1 parameterized constructor");
		
	}
	
	public Employee(String name) {
		this.name=name;
		
	}
	
	public Employee(String name, int age) {
		this.name= name;
		this.age= age;
	}
	
	
	public Employee(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp= new Employee("Tom");
		
		Employee emp1= new Employee("suchita", 30);
		
		Employee emp2= new Employee("Akshay", 30, "Such");
		System.out.println(emp2.age+emp2.id+emp2.name);
		
		//Employee emp3= new Employee();
		

	}

}
