package OOPS_Assignment;

public class EmployeeInfo {
	
	/*
	 * **************Encapsulation Assignment: @NaveenAutomationLabs
	Create Employee class
	define class vars with private: name, age, salary, isActive, Gender
	create getter and setter for each class private vars
	create getEmployeeInfo() method in Employe class which will return al the values of employee
	Test this feature:
	create EmployeeTest class 
	In main() method, create the object of Employee class
	set the values using set method
	call getEmployeeInfo() method and print all the employee values on the console.


	 */
	
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	private String Gender;
	
	
	public EmployeeInfo(String name, int age,double salary, boolean isActive, String Gender) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isActive=isActive;
		this.Gender=Gender;
	}

	public String getEmployeeInfo() {
		String e1 = name+salary+age+isActive+Gender;
		return e1;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}
	
	
	

}
