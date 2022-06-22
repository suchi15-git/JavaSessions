package BuilderPattern;

public class Ecomm {

public Ecomm login() {
	System.out.println("Default login");
	return this;
}

public Ecomm login(String username, String password) {
	System.out.println("Login with"+ " "+username+ " "+password);
	return this;
}

public Ecomm doSearch(String name) {
	System.out.println("Searching.."+name);
	return this;
}

public Ecomm doSearch(String name, int price) {
	System.out.println("Searching.."+name +""+price);
	return this;
}

public Ecomm addToCart(String name) {
	System.out.println("Adding to cart.."+name);
	return this;
}

public Ecomm doPayment(String upi) {
	System.out.println("Payment done");
	return this;
}

public Ecomm doPayment(String CC, int otp) {
	System.out.println("Paymanet done"+CC);
	return this;
}

public Ecomm logout() {
	System.out.println("Logged out default");
	return this;
}
}
