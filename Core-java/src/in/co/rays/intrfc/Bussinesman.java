package in.co.rays.intrfc;

public class Bussinesman implements Richman , SocialWorker {

	@Override
	public void earning() {
		
		System.out.println("earning");
	}

	@Override
	public void party() {
	
		System.out.println("party");
	}

	@Override
	public void donation() {
	
		System.out.println("donation");
	}

	@Override
	public void helpOthers() {
	
	   System.out.println("help others");	
	}
	
	

}
