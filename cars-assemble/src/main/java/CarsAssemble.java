public class CarsAssemble {
	
	private final int productionRatePerHour = 221;
	
	public double productionRatePerHour(int speed) {
		if (speed >= 1 && speed <= 4) {
			return productionRatePerHour * speed;
		} else if (speed >= 5 && speed <= 8) {
			return productionRatePerHour * 0.9 * speed;
		} else if (speed == 9) {
			return productionRatePerHour * 0.8 * speed;
		} else if (speed == 10) {
			return productionRatePerHour * 0.77 * speed;
		} else {
			return 0;
		}
	}
	
	public int workingItemsPerMinute(int speed) {
		return (int) productionRatePerHour(speed) / 60;
	}
}
