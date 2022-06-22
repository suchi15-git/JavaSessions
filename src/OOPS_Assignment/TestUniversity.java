package OOPS_Assignment;

import java.util.ArrayList;

public class TestUniversity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> course = new ArrayList<>();
		course.add("MBA");
		course.add("PHD");
		
		University t= new University("Mumbai","India","10/10/2020",course);
		System.out.println(t.getName()+ " "+t.getCountry()+ " "+t.getEstDate()+ " "+t.getCourse());

	}

}
