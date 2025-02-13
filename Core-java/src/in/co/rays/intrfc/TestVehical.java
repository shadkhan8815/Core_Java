package in.co.rays.intrfc;

public class TestVehical {
	
	public static void main(String[] args) {
		
		Vehical vc = new Car(40);
		        vc.start();
		        vc.accelerate(30);
		        vc.brake(20);
		        vc.refuling(50);
		        vc.stop();
		        
	     System.out.println("\t");
	
	     Vehical vb = new Bike(2);
	             vb.start();
	             vb.accelerate(20);
	             vb.brake(10);
	             vb.refuling(5);
	             vb.stop();
	
	}

}
