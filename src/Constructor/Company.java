package Constructor;

public class Company {
	
	String name;
	String hq;
	int empCount;
	boolean isActive;
	double sharePrice;
	
	

	public Company(String name, String hq) {
		super();
		this.name = name;
		this.hq = hq;
	}



	public Company(String name, String hq, int empCount, boolean isActive, double sharePrice) {
		super();
		this.name = name;
		this.hq = hq;
		this.empCount = empCount;
		this.isActive = isActive;
		this.sharePrice = sharePrice;
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
