package OOPS_Encapsulation;

public class Amazon {

private String username;
private String password;


public void doLogin() {
	System.out.println("Logged in with:" +username+ "" +password);
}

public Amazon(String username, String password) {
	this.username = username;
	this.password = password;
}


public String getUsername() {
	return username;
}


private void setUsername(String username) {
	this.username = username;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}



}
