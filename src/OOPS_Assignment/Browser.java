package OOPS_Assignment;

public class Browser {
	
	/**********************************************OOPS*************************************************
	 * Constructor Assignment -1
	*******************************************************************************************************
	Create a browser class, this class will have 3 private variable like Sting name , double version & String [] plugin.
	Create a constructor which will take name , version & plugin. 
	Create getters & setters.
	now create a test class & get values of name , version & plugin. 
	You can try updating values of name , version & Plugin using setters. 
	 */

	private String name;
	private double version;
	private String[] plugin;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getVersion() {
		return version;
	}


	public void setVersion(double version) {
		this.version = version;
	}


	public String[] getPlugin() {
		return plugin;
	}


	public void setPlugin(String[] plugin) {
		this.plugin = plugin;
	}


	public Browser(String name, double version , String[] plugin) {
		this.name= name;
		this.version= version;
		this.plugin = plugin;
		
	}
	
	
}
