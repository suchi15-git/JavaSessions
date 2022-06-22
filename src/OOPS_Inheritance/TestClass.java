package OOPS_Inheritance;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b = new BMW();
		b.start(); //overriden
		b.stop(); //inherited
		b.refuel(); //inherited
		b.autopark(); //individual
		
		
		//refrence type check
		//topcasting/upcasting - child class object can be referred by parent class refrence variable
		Car c1= new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//downcasting
		//parent class object can be referred by child class refrence variable
		 // BMW b1 = new Car();

		BMW b1 = (BMW)new Car();
		b1.start();
	}

}
