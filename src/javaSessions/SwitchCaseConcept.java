package javaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="Tom";
		
		//for simple if -else condition we cannot use break. with loop or switch case we can use break condition
		
		switch(name) {
		
		case "Harsh":
			System.out.println("Harsh got 100 marks");
			break;
			
		case "Suchita":
			System.out.println("Suchita got 90 marks");
			break;
			
		case "Naveen":
			System.out.println("Naveem got 80 marks");
			break;
			
		default:
			System.out.println("Student not found!");
			break;
		}
		
		//integer
		//in switch case only string and integer values are allowed
		
		int marks=90;
		
		switch (marks) {
		
		case 90:
			System.out.println("science");
			break;
			
		case 80:
			System.out.println("commerce");
			break;
		
		default:
			System.out.println("FAILED...");
			break;
		
		}
		
		String browser = "Chr  ome";
		switch(browser.toLowerCase().replace(" ", "")) {
		
		case "Chrome":
			System.out.println("Launch chrome");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
		case "FF":
			System.out.println("Launch FF");
			break;
		default:
			System.out.println("please pass the right browser" +browser);
		
		}
		
		
		//float
		float num = 10.30f;
		

		//char
		char initial ='C';
		switch (initial) {
		
		case 'A':
			System.out.println("letter A");
			break;
			
		case 'B':
			System.out.println("letter B");
			break;
			
		default:
			System.out.println("its default case");
		
		}
		
		//test environment (dev test qa prod performance) -- switch case and if else if
		
		String env = "QA";
		switch(env.toUpperCase()) {
		
		case "DEV":
			System.out.println("run test cases on DEV environment");
			break;
			
		case "QA":
			System.out.println("run test cases on QA environment");
			break;
		
		case "TEST":
			System.out.println("run test cases on TEST environment");
			break;
		
		case "PROD":
			System.out.println("run test cases on PROD environment");
			break;
			
		case "PERF":
			System.out.println("run test cases on PERF environment");
			break;
			
		default:
			System.out.println("run test cases on test environment" +env);
		
		}
		
		//state as key (KA, MH, DELHI and create cases for corona)
		
		String state="KA";
		switch(state.toUpperCase()) {
		
		case "KA":
			System.out.println("Total corona cases are 10000");
			break;
		
		case "MH":
			System.out.println("Total corona cases are 9000");
			break;
			
		case "DELHI":
			System.out.println("Total corona cases are 8000");
			break;
		
		default:
			System.out.println("no corona cases for the assignment" +state);
			
		
		
		
		}

		
			
	}

}
