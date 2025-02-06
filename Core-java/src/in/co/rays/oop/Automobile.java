package in.co.rays.oop;

public class Automobile {
	
	private String color ;
	private int speed ;
	private String make ;
	public static final int NO_OF_GEARS = 6 ;
	
	
	public String getColor() {
		return color;
	}
	 public void setColor(String color) {
		this.color = color;
	}
	 public String getMake() {
		return make;
	}
	 public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	// public void break (int break) {
		// this.break = break;
		 //if (speed == 0) {
			// System.out.println("apply break:" + break );
			 
//		 }
	// }
	  public void changeGear(int changeGear) {
		if (speed > 0) {
			speed = changeGear + speed;
			System.out.println("gear change to " + changeGear);
		}
		  
	  }
	   public void accelerate(int accelerate) {
		   if(accelerate > 0) {
			//   speed = speed + accelerate;
			   System.out.println("accelerating speed:" + speed );
		   }
	   }
}
