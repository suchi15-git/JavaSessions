package OOPS_Abstract;

public class LoginPage extends Page{

	public LoginPage() {
		System.out.println("Loginpage constructor");
	}
	
	public LoginPage(int a) {
		super(a);
		System.out.println("LoginPage constructor:"+a);
	}
	@Override
	public void title() {
		System.out.println("Login page title");
		
	}

	@Override
	public void url() {
		System.out.println("Login page url");
		
	}

	@Override
	public void header() {
		System.out.println("Login page header");
		
	}
	
	public void doLogin() {
		System.out.println("Login to app");
	}
	

}
