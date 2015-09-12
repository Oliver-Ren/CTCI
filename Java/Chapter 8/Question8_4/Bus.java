
public class Bus extends Vehicle {
	public Bus(String licence, boolean isDis) {
		this.licencePlate = licence;
		this.isDriverDisabled = isDis;
		this.size = VehicleSize.LARGE;
		this.spotsNeeded = 1;
	}
	
	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		if (spot.getSize() != VehicleSize.LARGE) {
			return false;
		}
		
		return isDriverDisabled || !spot.isForDisabled();
	}
}
