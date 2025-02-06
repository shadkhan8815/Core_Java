package in.co.rays.oop.cnstr;

public class TestCalRectangle {

public static void main(String[] args) {
	
	//constructor cal;
	
	Rectangle r = new Rectangle();
	
	Rectangle rt= new Rectangle(5);
	System.out.println("rectangle length:" + rt.getLength());
	
    Rectangle r1 = new Rectangle(10,5) ;
	//System.out.println("reactangle length:" + r1.getLength());
	System.out.println("rectangle width:" + r1.getWidth()) ;
	
	// set get method cal ;
	
	Rectangle rl = new Rectangle();
	
	rl.setLength(5);
	System.out.println("length:" + rl.getLength());
	
	rl.setWidth(10);
	System.out.println("width:" + rl.getWidth());
	
	rl.area();

  }
}