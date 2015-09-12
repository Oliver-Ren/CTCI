
public class Car extends Vehicle {
	public Car(String licence, boolean isDis) {
		this.licencePlate = licence;
		this.isDriverDisabled = isDis;
		this.size = VehicleSize.MEDIUM;
		this.spotsNeeded = 1;
	}
	
	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		if (spot.getSize() == VehicleSize.SMALL) {
			return false;
		}
		
		return isDriverDisabled || !spot.isForDisabled();
	}

}
