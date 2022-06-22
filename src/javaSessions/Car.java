package javaSessions;

public class Car {
	
	String name;
	int wheels;
	String color;
	int price;
	
	public static void main(String[]args) {
		
		Car c1= new Car();
		c1.color="Black";
		c1.name="BMW";
		c1.wheels=4;
		c1.price=30;
		
		
		Car c2= new Car();
		c2.color="White";
		c2.name="AUDI";
		c2.wheels=4;
		c2.price=30;
		
		Car c3= new Car();
		c3.color="Red";
		c3.name="Honda";
		c3.wheels=4;
		c3.price=30;
		
		//in this case each and every object will be having wheels=4 property
		
		
	}

}
