package javaSessions;

public class Employee {
	
	String name;
	int age;
	String city;
	double salary;
	boolean isActive;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.name ="Tom";
		emp.age=29;
		emp.city="LA";
		emp.salary=12.33;
		
		System.out.println(emp.name+ " "+emp.age+ " "+emp.city+ " "+emp.salary );
		
		Employee emp2 = new Employee();
		System.out.println(emp2.name); //null
		
		Employee emp3 = new Employee();
		System.out.println(emp3.isActive);
		
		Employee emp4 = new Employee();
		emp4=null; //null refrence object
		emp4.name="Lisa";
		System.out.println(emp4.name);
		
		//at compile time it will not give any error but at the runtime it will give null pointer exception
		//if object refrence is pointing to null never point to object properties
		
		new Employee();
		//no refrence object
		// in memory one object is created but nobody is refering that object
		new Employee().name="suchita";
		new Employee().age =30;
		
		//here two objects are created 
		//never create object without any refrence

	}

}
