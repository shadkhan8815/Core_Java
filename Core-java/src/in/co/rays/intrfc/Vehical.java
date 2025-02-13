package in.co.rays.intrfc;

public interface Vehical {
	
	public void start();
	
	public void accelerate(int increment);
	
	public void brake(int decrement);
	
	public void refuling(double fuelAmount);

	public void stop();
}
