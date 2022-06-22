package WebDriverArch;

public interface WebDriver extends SearchContext {
	
	@Override
	public void findElement(String element);
	
	@Override
	public void findElements(String elements);
	
	
	public void get(String url);
	
	public String getTitle();
	
	public String getUrl();
	
	public void click(String ele);
	
	public void sendKeys(String ele, String value);
	
	public void quit();

}
