package MethodConcepts;

public class Application {
	
	//no input- no return
	public void test() {
		System.out.println("test method");
	}
	
	public void addition() {
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println(c);
	}

	//no input and some return
	public String getName() {
		System.out.println("get name method..");
		String name ="Tom";
		return name;
	}
	
	public int getSum() {
		int a= 10;
		int b=20;
		
		int sum =a+b;
		return sum;
	}

	//some input and some return
	public int subtract(int a, int b) {
		int sub = a-b;
		
		return sub;
	}
	
	//WAF input StudentName(String) return marks (int)
	
	public int getMarks(String StudentName) {
		System.out.println("getting marks for student:" +StudentName);
		int marks=-1;
		if(StudentName.equals("Monika")) {
		marks= 100;
		}
		else if(StudentName.equals("Ravi")){
		marks= 90;
		}
		else if(StudentName.equals("Deepa")){
			marks= 80;
			}
		
		else {
			System.out.println("Student not found:" +StudentName);
			
		}
		
		return marks;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application app = new Application();
		app.test(); //calling a function
		app.addition();
		String n= app.getName();
		System.out.println(n);
		
		int sum = app.getSum();
		System.out.println(sum);
		
		int sub = app.subtract(10, 20);
		System.out.println(sub);
		
		int marks =app.getMarks("Suchi");
		System.out.println(marks);
		

	}

}
