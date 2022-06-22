package Constructor;

public class LoginPage {

	String username;
	String password;
	
	public LoginPage() {
		System.out.println("default const....");
	}

	public LoginPage(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public void doLogin() {
		System.out.println("Please enter creds:" +username +password);
		System.out.println("Logged in successfully");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage login = new LoginPage("Suchita", "Suchoo@!23");
		login.doLogin();
		
		//Student s = new Student ();
	
		
		

	}

}
