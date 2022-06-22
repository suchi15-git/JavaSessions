package OOPS_Encapsulation;

public class Employee {

	
	private String name;
	private int age;
	private double salary;
	
	//getter and setter:
	
	//avoid setter
	//getter is mandate
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Employee emp = new Employee();
//		emp.name="Tom";
//		emp.age= 30;
//		emp.salary=100;
//		
//		
//	}

	public String getName() {
		return name;
	}

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
