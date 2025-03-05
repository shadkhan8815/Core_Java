package in.co.rays.IO.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	
public static void main(String[] args) throws Exception {
		
		Marksheet m = new Marksheet();
		m.id = 10;
		m.name = "yash";
		m.physics = 89;
		m.chemistry = 99;
		m.maths = 81;
		m.total = m.physics + m.chemistry + m.maths;

		FileOutputStream file = new FileOutputStream("C:\\Users\\pc\\OneDrive\\Desktop\\io\\hello.txt");

		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(m);

		out.close();
		file.close();

		System.out.println("Object write successfully....!!!");
		System.out.println("total = " + m.total);
	}
  }
