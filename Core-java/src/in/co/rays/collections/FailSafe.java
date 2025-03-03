package in.co.rays.collections;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe {
	
	public static void main(String[] args) {

		Vector list = new Vector();

		list.add(100);
		list.add("one");
		list.add(200);
		list.add("two");
		list.add(100);

		Enumeration e = list.elements();
		
		list.add(300);
		
		while (e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
			
		}

	}


}
