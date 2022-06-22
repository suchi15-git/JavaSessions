package OOPS_Interfaces;

public interface USMedical extends WHO , UNSG{
	
	int min_fee=10;
	
	public abstract void physioServices();
	public abstract void cardioServices();
	public abstract void pediaServices();
	public abstract void emergencyServices();
	
	@Override
	public void covidGuidelines();
	
	
	//after jdk 1.8 there are two major changes:
	// we can have static method along with body in interface
	
	public static void billing() {
		System.out.println("US Medical-----billing");
	}

	//we can have a default method
	 default void medNews() {
		 System.out.println("giving news");
	 }
}
