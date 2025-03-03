package in.co.rays.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(1);
		c.add(2.1);
		c.add(0.12);
		c.add('a');
		c.add("rays");
		c.add(2);
		c.add('b');
		c.add('c');
		System.out.println("C add =" + c);

		System.out.println(c.hashCode());
		System.out.println(c.isEmpty());
		System.out.println("c size =" + c.size());
		c.remove("rays");

		Collection c1 = new ArrayList();

		c1.add(1);
		c1.add(2);
		c1.add('a');
		c1.add('b');
		c1.add('c');

		c1.contains(c);
		System.out.println("c1 contains =" + c1);

		c1.addAll(c);
		System.out.println("C1 addedall c =" + c1);

		c1.equals(c);
		System.out.println("c1 equals =" + c1);

		System.out.println(c1.isEmpty());
		System.out.println("c1 size =" + c1.size());

	}

}
