package OOPS_Interfaces;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FortisHospital forhop = new FortisHospital();
		forhop.emergencyServices();
		forhop.cardioServices();
		forhop.medicalInsurance();
		forhop.medicleTrainine();
		forhop.patientHistory();
		
		System.out.println(FortisHospital.min_fee);
		
		
		WHO wh = new FortisHospital();
		wh.covid19Vaccination();
		wh.covidGuidelines();
		
		//TOP CASTING
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.emergencyServices();
		us.pediaServices();
		us.physioServices();
		USMedical.billing();
		
		//downcasting - is not possible in interface as we cannot create object of interface at compile and runtime as well

	}

}
