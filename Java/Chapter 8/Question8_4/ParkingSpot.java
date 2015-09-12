
public class ParkingSpot {
	private Vehicle vehicle;
	private VehicleSize spotSize;
	private int level;
	private int row;
	private int index;
	private boolean isForDisabled;
	
	public ParkingSpot(int idx, int row, int level, VehicleSize size, boolean forDis) {
		this.index = idx;
		this.row = row;
		this.level = level;
		this.spotSize = size;
		this.isForDisabled = forDis;
	}
	
	/* getters. */
	public int getIndex() {
		return index;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getLevel() {
		return level;
	}
	
	public boolean isForDisabled() {
		return isForDisabled;
	}
	
	public VehicleSize getSize() {
		return spotSize;
	}
	
	public boolean isAvailable() {
		return vehicle == null;
	}
	
	// clean this spot.
	public void remove() {
		this.vehicle = null;
	}
	
	// park vehicle in the spot.
	public void add(Vehicle v) {
		this.vehicle = v;
	}
}
