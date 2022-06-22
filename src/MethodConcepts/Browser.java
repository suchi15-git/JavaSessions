package MethodConcepts;

public class Browser {
	
	
	/* WAF : launch the browser- FF/SAFARI/CHROME
	 * function launchBroswer(String browserName)
	 * return : true/false (boolean)
	 * */  
	
	public boolean launchBrowser(String browserName) {
		
		boolean isLaunch = false;
		System.out.println("Launching the browser:" +browserName);
		
		switch(browserName.toLowerCase()) {
		
		case "chrome":
			System.out.println("Launching chrome browser..");
			isLaunch =true;
			break;
			
		case "ff":
			System.out.println("Launching FF browser..");
			isLaunch =true;
			break;
			
		case "safari":
			System.out.println("Launching safari browser..");
			isLaunch =true;
			break;
		
			default:
				System.out.println("unable to launch the browser..");
		}
		
		return isLaunch;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser bro = new Browser();
		boolean val = bro.launchBrowser("FF");
		System.out.println(val);

	}

}
