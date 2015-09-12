
public class Motorcycle extends Vehicle {
	public Motorcycle(String licence, boolean isDis) {
		this.licencePlate = licence;
		this.isDriverDisabled = isDis;
		this.size = VehicleSize.SMALL;
		this.spotsNeeded = 1;
	}
	
	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		return isDriverDisabled || !spot.isForDisabled();
	}
}
