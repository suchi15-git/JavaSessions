package Finalize;

public class Employee {
	
	int age=10;
	
	@Override
	public void finalize() {
		System.out.println("emp finalize method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e= new Employee();
		e= null;
		

		
		Student s = new Student();
		s=null;
		System.gc();
//		System.out.println(s.name);

	}

}
