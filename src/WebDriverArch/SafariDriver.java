package WebDriverArch;

public class SafariDriver implements WebDriver {
	public SafariDriver() {
		System.out.println("Launch safari browser");
	}

	@Override
	public void findElement(String element) {
		// TODO Auto-generated method stub
		System.out.println("Find element:" +element);
		
	}

	@Override
	public void findElements(String elements) {
		// TODO Auto-generated method stub
		System.out.println("Find elements:" +elements);
		
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("enter url:" +url);
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Amazon";
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "www.amazon.com";
	}

	@Override
	public void click(String ele) {
		// TODO Auto-generated method stub
		System.out.println("click on element:" +ele);
		
	}

	@Override
	public void sendKeys(String ele, String value) {
		// TODO Auto-generated method stub
		System.out.println("Enter value in:" +ele +"value is:" +value);
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		System.out.println("quit the browser");
		
	}

}
