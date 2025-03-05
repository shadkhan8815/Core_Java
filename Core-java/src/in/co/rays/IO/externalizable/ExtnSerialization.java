package in.co.rays.IO.externalizable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ExtnSerialization {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee();
		e.id = 1;
		e.name = "yash";
		e.address = "indore";
		e.salary = 50000;

		FileOutputStream file = new FileOutputStream("C:\\Users\\pc\\OneDrive\\Desktop\\io\\extobj.txt");

		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(e);

		out.close();
		file.close();

		System.out.println("Object write successfully....!!!");
	}
}
