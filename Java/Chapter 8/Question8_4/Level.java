
public class Level {
	private int levelNum;
	private ParkingSpot[] spots;
	private int availableSpots;
	private static final int SPORT_PER_ROW = 10;
	
	public Level(int lNum, int numberSpots) {
		this.levelNum = lNum;
		this.availableSpots = numberSpots;
		this.spots = new ParkingSpot[numberSpots];
	}
	
	public boolean parkVehicle(Vehicle v) {
		int location = findParkingSpot(v);
		if (location < 0) {
			return false;
		}
		
		return parkStartingAtSpot(location, v);
	}
	
	private boolean parkStartingAtSpot(int num, Vehicle v) {
		int spotsNeeded = v.spotsNeeded;
		while (spotsNeeded > 0 && spots[num].isAvailable()) {
			v.parkInSpot(spots[num]);
			spots[num].add(v);
			spotsNeeded--;
			num++;
		}
		
		return (spotsNeeded == 0);
	}
	private int findParkingSpot(Vehicle v) {
		for (int i = 0; i < spots.length; i++) {
			for (int j = 0; j <= v.spotsNeeded; j++) {
				if (!spots[i + j].isAvailable()) {
					break;
				}
				
				if (j == v.spotsNeeded) {
					return i;
				}
			}
			
		}
		
		return -1;
	}
	
}
