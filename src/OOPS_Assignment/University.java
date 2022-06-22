package OOPS_Assignment;

import java.util.ArrayList;

public class University {
	
	private String name;
	private String country;
	private String estDate;
	private ArrayList<String> course;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getEstDate() {
		return estDate;
	}
	
	public void setEstDate(String estDate) {
		this.estDate = estDate;
	}
	
	public ArrayList<String> getCourse() {
		return course;
	}
	
	public void setCourse(ArrayList<String> course) {
		this.course = course;
	}
	
	
	public University(String name,String country,String estDate,ArrayList<String> course) {
		this.name = name;
		this.country =country;
		this.estDate =estDate;
		this.course = course;
	}
	

} 