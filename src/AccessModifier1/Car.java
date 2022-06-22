package AccessModifier1;

public class Car {
	
	public String name;
	private int price;
	protected String color;
	int model;
	
	
	public void publicM() {
		System.out.println("public");
	}
	
	private void privateM() {
		System.out.println("Private");
	}
	
	protected void protectM() {
		System.out.println("Protected");
	}
	
	 void defaultM() {
		 System.out.println("default");
	 }
	 
	public static void main(String []args) {
		
		Car c = new Car();
		
		
		
	}
	

}
