package SuperKeyword;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee e2= new Employee();
		
		Employee e= new Employee(10);
		
		Employee e1= new Employee(10,20);

		System.out.println(e.salary);
		
		e.getSalary();
		e.holiday();
		
	}

}
