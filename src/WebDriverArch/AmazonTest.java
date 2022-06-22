package WebDriverArch;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crossbrowser testing
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		String browser= "IE";
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();			
		}
		else if(browser.endsWith("Safari")) {
			 driver = new SafariDriver();
		}
		else if(browser.equals("Firefox")) {
			 driver = new FirefoxDriver();
		}
		else {
			System.out.println("please pass the right browser name"+browser);
		}
		driver.get("http://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getUrl();
		System.out.println(url);
		
		driver.findElement("email-id");
		driver.sendKeys("email-id", "suchitakadge35@gmail.com");
		
		driver.findElement("email-pw");
		driver.sendKeys("email-pw", "suchita@123");
		
		driver.findElement("login_btn");
		driver.click("login_btn");
		
		driver.quit();

	}

}
