package OOPS_Assignment;

public class TestBrowser {

	public static void main(String[] args) {
		
		
		String [] names = new String[12];
		// TODO Auto-generated method stub
		String [] plug = {"a","B"};
		Browser b = new Browser("Chrome",9.0, plug );
		for( String str : b.getPlugin()){
			System.out.println(str);
			
		}
		
		//System.out.println(b.toString());
		
		
		System.out.println(b.getName());
		
		b.setName("Suhcita");
		
		System.out.println(b.getName());

	}

}
