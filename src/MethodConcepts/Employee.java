package MethodConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
	
	//WAF: getEmpDevices (String name) , return ArrayList(String)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		ArrayList<String> Devices = emp.getEmpDevices("Naveen");
		System.out.println(Devices);
		
		String [] arrDept=emp.getCompInfo("IBM");
		System.out.println(Arrays.toString(arrDept));
		
		
		
		

	}
	
	public ArrayList<String> getEmpDevices(String name) {
		
		ArrayList<String> devicesList= new ArrayList<String>();
		System.out.println("Employee name is:" +name);
		
		if(name.equals("Suchita")) {
			
			devicesList.add("Iphone11");
			devicesList.add("Android");
		}
		else if (name.equals("Shashi")) {
			devicesList.add("Samsung");
			devicesList.add("iphone10");
		}
		
		else {
			System.out.println("Employee not found:"+name);
		}
		
		return devicesList;
	}
	
	//Static array example
	public String[] getCompInfo(String compName) {
		String dept[] = new String[5];
		
		
		System.out.println("Company name:" +compName);
		if(compName.equals("IBM")) {
			dept[0] ="HR";
			dept[1] ="ADMIN";
			dept[2] ="FINANCE";
			dept[3]= "QA";
			dept[4] = "PRODUCT";	
		}
		
		else if(compName.equals("TCS")) {
			dept[0] ="HR";
			dept[1] ="ADMIN";	
		}
		else {
			System.out.println("Company not found:"+compName);
		}
		
		return dept;
	}

}
