package javaSessions;

public class User {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u1 = new User();
		u1.age = 20;
		u1.name ="Suchita";
		u1.city= "Mumbai";
		
		
		User u2 = new User();
		u2.age= 23;
		u2.name = "Akshay";
		u2.city= "Pune";
		
		User u3 = new User();
		u3.age= 25;
		u3.name ="Pani";
		u3.city = "Kalyan";
		
		System.out.println(u1.name+ " "+u1.age+ " "+u1.city);
		System.out.println(u2.name+ " "+u2.age+ " "+u2.city);
		System.out.println(u3.name+ " "+u3.age+ " "+u3.city);
		
		u1=u2;
		//refrence assignments
		System.out.println(u1.name+ " "+u1.age+ " "+u1.city);
		System.out.println(u2.name+ " "+u2.age+ " "+u2.city);
		System.out.println(u3.name+ " "+u3.age+ " "+u3.city);
		
		System.out.println("----------------------------------------");
		
		u2=u3;
		System.out.println(u1.name+ " "+u1.age+ " "+u1.city);
		System.out.println(u2.name+ " "+u2.age+ " "+u2.city);
		System.out.println(u3.name+ " "+u3.age+ " "+u3.city);
		
		System.out.println("----------------------------------------");
		
		u3=u1;
		System.out.println(u1.name+ " "+u1.age+ " "+u1.city);
		System.out.println(u2.name+ " "+u2.age+ " "+u2.city);
		System.out.println(u3.name+ " "+u3.age+ " "+u3.city);
		
		System.out.println("----------------------------------------");
		
		//u1 will be destroyed by the garbage collector as there is no refrence for that object
		// we can have one object with multiple refrences 
	}

}
