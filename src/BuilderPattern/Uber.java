package BuilderPattern;

public class Uber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RidesharingCompany ride = new RidesharingCompany();
		
		//workflow1
		ride.login("Suchita", "Password")
		.enterCurrentLocation("Lower Parel")
		.enterDestination("Virar")
		.selectVehicle("SUV")
		.bookVehicle()
		.otpReceived(21345)
		.endTrip();
		
		//workflow2
		ride.login()
		.enterLocation("south", "north")
		.selectVehicle("auto")
		.logout();

	}

}
