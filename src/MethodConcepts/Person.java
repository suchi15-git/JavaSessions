package MethodConcepts;

public class Person {
	int x;
	int y;
	
	public int sum(int a , int b) {
		int z= a+b;
		System.out.println(z);
		
		return z;
	}
	
	public void sum() {
		System.out.println("Bye......");
	}
	
	public void getInfo(Person p) {
		
		System.out.println(x);
		System.out.println(y);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p = new Person();
		p.sum(10, 20); //call by value /arguments
		
		p.x= 300;
		p.y=200;
		
		p.getInfo(p);
		
		
	}

}
