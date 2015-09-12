
public class ParkingLot {
	private Level[] levels;
	
	public boolean parkVehicle(Vehicle v) {
		for (int i = 0; i < levels.length; i++) {
			if (levels[i].parkVehicle(v)) {
				return true;
			}
		}
		
		return false;
	}
	
	
}
