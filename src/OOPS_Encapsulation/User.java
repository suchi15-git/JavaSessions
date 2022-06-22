package OOPS_Encapsulation;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amazon seller = new Amazon("username", "password");
		
		seller.doLogin();
		
		seller.setPassword("updated");
		
		seller.doLogin();

	}

}
