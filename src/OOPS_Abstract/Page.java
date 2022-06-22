package OOPS_Abstract;

public abstract class Page {
	
	int time =10;
	static int age =20;

	//0-100% abstraction
	//100% abstraction - only abstract methods
	//partial abstraction - abstract and non-abstract methods
	//0% abstraction - no abstract method
	
	public  abstract void title();
	
	public abstract void url();
	
	public void timeout() {
		System.out.println("page timeout-20ms");
	}
	
	public abstract void header();
	
	public Page() {
		System.out.println("Page constructor");
	}
	
	public Page(int a) {
		System.out.println("Page constructor:" +a);
	}
}
