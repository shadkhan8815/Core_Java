package in.co.rays.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionRetainAll {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add('a');
		c.add('b');
		c.add('c');
		
		System.out.println("c =" + c);
		
		Collection c1 = new ArrayList();
		
		c1.add('a');
		c1.add('b');
		c1.add('c');
		c1.add('d');
		c1.add('e');
		
		System.out.println("c1 =" + c1);
		
		c.retainAll(c1);
		System.out.println("c retain =" + c);
		
	}

}
