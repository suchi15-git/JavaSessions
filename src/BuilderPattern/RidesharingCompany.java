package BuilderPattern;

public class RidesharingCompany {
	
	public RidesharingCompany login() {
		System.out.println("This is the default login...");
		return this;
	}
	
	public RidesharingCompany login(String username, String password) {
		System.out.println("User logged in:"+ " " +username+ " "+password);
		return this;
	}
	
	public RidesharingCompany gpsTurnOn() {
		System.out.println("GPS Turned On...");
		return this;
	}
	
	public RidesharingCompany enterCurrentLocation(String currentLoc) {
		System.out.println("Current location entered...");
		return this;
	}
	
	public RidesharingCompany enterDestination(String destinationLoc) {
		System.out.println("Destination entered...");
		return this;
	}
	
	public RidesharingCompany enterLocation(String currentLoc, String destinationLoc) {
		System.out.println("Location entered..."+ " "+currentLoc + " "+destinationLoc);
		return this;
	}
	
	public RidesharingCompany selectVehicle(String name) {
		System.out.println("Vehicle type selected...");
		return this;
	}
	
	public RidesharingCompany bookVehicle() {
		System.out.println("Vehicle booked...");
		return this;
	}

	public RidesharingCompany otpReceived(int OTP) {
		System.out.println("OTP received by customer...");
		return this;
		
	}
	
	public RidesharingCompany endTrip() {
		System.out.println("trip ended by driver");
		return this;
	}
	
	public RidesharingCompany logout() {
		System.out.println("Logged out");
		return this;
	}
}
