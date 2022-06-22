package BuilderPattern;

public class AamazonShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ecomm e1 = new Ecomm();
			e1.login("Username", "Password")
			.doSearch("Mackbook")
			.addToCart("Macnook pro")
			.doPayment("UPI")
			.logout();
				

	}

}
