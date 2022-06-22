package OOPS_Interfaces;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical{



	//us medical
	@Override
	public void physioServices() {
		System.out.println("This is -physioServices");
	
		
	}

	@Override
	public void cardioServices() {

		System.out.println("This is -cardioServices");
		
	}

	@Override
	public void pediaServices() {
	
		System.out.println("This is -pediaServices");
	}

	@Override
	public void emergencyServices() {
		System.out.println("This is -emergencyServices");
		
	}

	public void medicalInsurance() {
		System.out.println("this is medical insurance method of hospital");
	}
	
	public void medicleTrainine() {
		System.out.println("this is medical training method of hospital");
	}

	@Override
	public void intServices() {
		
		System.out.println("this is intServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("this is dentalServices");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("this is orthoServices");
		
	}

	@Override
	public void onchrologicalServices() {
		System.out.println("this is onchrologicalServices");
		
	}

	//WHO
	@Override
	public void covid19Vaccination() {
		System.out.println("Covid 19 vaccination");
	}

	@Override
	public void covidGuidelines() {
		System.out.println("covid guidelines");
		
	}
	
	//UNSG
	@Override
	public void medicalFunds() {
		System.out.println("UNSG providing funds...");
		
	}
	
	//method hiding
	public static void billing() {
		System.out.println("Fortis providing billing");
	}
	
	
	//override
	public void medNews() {
		System.out.println("mednews given by fortis hospital");
	}
}
