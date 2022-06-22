package OOPS_Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("Launching browser");
		checkOSVersions();
		checkRAM();
		
	}

	public void checkOSVersions() {
		System.out.println("Checking OS");
	}
	
	public void checkRAM() {
		System.out.println("Checking RAM");
	}

	
}
