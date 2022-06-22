package MethodConcepts;

public class Customer {
	
	String name;
	int age;
	
	static String url ="https://www.amazon.com";
	
	public static void shareInfo() {
		System.out.println("Share infor....");
	}
	
	public void sendMail(){
		System.out.println("send mail.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer obj= new Customer();
		obj.age= 20;
		obj.name ="Suchita";
		System.out.println(obj.url);
		
		obj.shareInfo();
		
		//call static methods /variables
		System.out.println(Customer.url);
		Customer.shareInfo();
		
		//call them directly
		System.out.println(url);
		shareInfo();

	}

}
