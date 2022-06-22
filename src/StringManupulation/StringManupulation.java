package StringManupulation;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hi this is my java code";
		
		System.out.println(s.length());
		//Highest index = s.length-1
		//lowest index =0
		
		//USED TO FIND CHARACTER AT SPECIFIC INDEX
		System.out.println(s.charAt(4));
		
		System.out.println(s.charAt(s.length()-1));
		System.out.println(s.charAt(0));
		
		//SIOB
		//System.out.println(s.charAt(-1));
		
		//SIOB
		//System.out.println(s.charAt(23));
		
		//to find index of particular character
		System.out.println(s.indexOf('t'));
		
		System.out.println(s.indexOf('e'));
		
		
		System.out.println(s.indexOf("this"));

		System.out.println(s.indexOf("Hi"));
		
		System.out.println(s.indexOf("suchita"));
		
		
		String msg = "welcome admin";
		if(msg.indexOf("admin")>0) {
			System.out.println("admin present");
			
		}
		else {
			System.out.println("admin not present");
		}
		
		//contains
		String con = "welcome naveen to this plae";
		System.out.println(con.contains("naveen"));
		
		if(con.contains("naveen")) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}
		
		//compares
		//string literals - in this case only one object is created which is refrerred by three refrebce variabke
		//duplicate values are not allowed inside SCP
		
		String s1= "welcome selenium";
		String s2= "welcome selenium";
		String s4= "welcome selenium";
		
		if(s1.equals(s2)) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings are unequal");
		}
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//new object will get created inside heap memory
		String s3= new String("welcome selenium");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s3)); //value comparison
		
		

		//trim - remove spaces from corner
		String pop = " hello and selenium  ";
		System.out.println(pop.trim());
		
		//replace
		String pom = "hellow  you   bitch";
		System.out.println(pom.replace(" ", ""));
		
		//lower upper
		String low ="testing is my fav";
		System.out.println(low.toUpperCase());
		System.out.println(low.toLowerCase());
		
		//split- 
		String lang ="JAVA_PYTHON_RUBI_DOTNET";
		String [] lang1= lang.split("_");
		System.out.println(lang1[0]);
		
		for(String lang2:lang1) {
			System.out.println(lang2);
		}
		
		String loop = "xXtestingxXXseleniumxXXXpython";
		String [] loop1 = loop.split("xX");
		System.out.println(loop1[0]);
		
		String empData ="moni;patel;90;1990;ios;android";
		String [] data = empData.split(";");
		for(String e:data) {
			System.out.println(e);
		}
		
		
		String db= "29/09/2020";
		System.out.println(db.replace('/', '-'));
		System.out.println(db);
	}

}
