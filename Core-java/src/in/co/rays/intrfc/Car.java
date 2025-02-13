package in.co.rays.intrfc;

public class Car implements Vehical {
	
	private int speed ;
	private double fuelLevel ;
	
	public Car (double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	
	@Override
	public void start() {
		if(fuelLevel > 0) {
			System.out.println("car start");
		}
		else {
			System.out.println("car not start");
		}
	}
	
	@Override
	public void accelerate(int increment) {
		speed = speed + increment;
		System.out.println("accelerate speed:" + speed + "km/h");
	}
	
	@Override
	public void brake(int decrement) {
		speed = Math.max(0, speed - decrement );
			System.out.println("after brake applied current speed is:" + speed);
		}
	
	@Override
	public void refuling(double fuelAmount) {
		fuelLevel = fuelAmount +  fuelLevel;
		System.out.println("refuling.....refuled:" + fuelLevel + "ltr");
		 }
	
	
	@Override
	public void stop() {
      speed = 0;
      System.out.println("car stopped:" + speed);
		
	}
	
}
