package in.co.rays.intrfc;

public class Bike implements Vehical {

	private int speed;
	private double fuelLevel;

	public Bike(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	@Override
	public void start() {
		if (fuelLevel > 0) {
			System.out.println("bike start");
		} else {
			System.out.println("bike not start");
		}
	}

	@Override
	public void accelerate(int increment) {
		speed += increment;
		System.out.println("accelerate speed:" + speed + "kmh");
	}

	@Override
	public void brake(int decrement) {
		if (speed > decrement) {
			speed -= decrement;
			System.out.println("brake applied:" + speed);
		}
	}

	@Override
	public void refuling(double fuelAmount) {
		fuelLevel += fuelAmount;
		System.out.println("refuling......refuled:" + fuelLevel + "ltr");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("bike stop");
	}

}
