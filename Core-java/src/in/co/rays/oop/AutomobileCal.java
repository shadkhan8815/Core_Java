package in.co.rays.oop;

public class AutomobileCal {
	
	public static void main(String[] args) {
		
		Automobile am = new Automobile() ;
		
		am.setColor("blue");
		System.out.println(am.getColor());
		
		am.setMake("swift");
		System.out.println(am.getMake());
		 
		am.setSpeed(110);
		System.out.println(am.getSpeed());
		
		am.changeGear(6);
		am.accelerate(80);
	}

}
