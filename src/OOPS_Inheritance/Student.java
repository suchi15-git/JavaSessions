package OOPS_Inheritance;

public class Student extends College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		University u1 = new University();
		u1.degreeBTEC(); //university btec
		u1.degreeBArch(); //university barch
		
		College c1 = new College();
		c1.degreeBTEC(); //college btech
		c1.degreeBArch(); //university barch
		c1.degreePGA(); //college pga
		
		
		//topcasting
		College c2 = new Student();
		c2.degreeBArch();
		c2.degreeBTEC();
		c2.degreePGA();
		
		//downcasting
		Student s1 = (Student) new College();
		s1.degreeBArch();

	}
	
	public void selectbranch() {
		System.out.println("Student selected branch..");
	}
	
	@Override
	public void degreeBTEC() {
		System.out.println("Student select extc degree...");
		
	}

}


