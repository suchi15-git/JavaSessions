package javaSessions;

public class AmazonRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Register reg = new Register();
		reg.name = "Such";
		reg.gender= 'F';
		
		reg.name ="Peter";
		System.out.println(reg.name);
		
		Register reg1 = new Register();
		reg1.name ="Such";
		System.out.println(reg1.name);
		
		System.out.println(reg1.gender); //blank value
		
		//when both the classes are available in the same package we dont need to import the class
		//if you have a class in differenet package p1 and you are creating the object in package p2 then at that time you need to import the package p1 in class p2
		//in the same package we cannot create duplicate classes
		//in two different packages we can create duplicate classes
		
		

	}

}
