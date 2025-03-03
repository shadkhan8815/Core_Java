package in.co.rays.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {
	
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(100);
		list.add("one");
		list.add(200);
		list.add("two");
		list.add(100);

		Iterator it = list.iterator();
		
		list.add(300);
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
		}
	}

}
