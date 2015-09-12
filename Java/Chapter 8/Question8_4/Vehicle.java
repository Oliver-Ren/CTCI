import java.util.ArrayList;


public abstract class Vehicle {
	// a list of which parking spot is occupied by the
	// vehicle.
	protected ArrayList<ParkingSpot> parkingSpots
	 = new ArrayList<ParkingSpot>();
	
	// the property of driver.
	protected boolean isDriverDisabled;
	
	protected VehicleSize size;
	
	// the identified of a vehicle
	protected String licencePlate;
	
	// number of parking spots need to park this vehicle.
	protected int spotsNeeded;
	
	public void parkInSpot(ParkingSpot spot) {
		parkingSpots.add(spot);
	}
	
	public void removeSpot(ParkingSpot spot) {
		parkingSpots.remove(spot);
	}
	
	public abstract boolean canFitInSpot(ParkingSpot spot);
	
}
