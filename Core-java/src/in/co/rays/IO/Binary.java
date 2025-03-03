package in.co.rays.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Binary {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("C:\\Users\\pc\\OneDrive\\Pictures\\My Collection\\Snapchat-921840756.jpg");

		FileOutputStream out = new FileOutputStream("C:\\Users\\pc\\OneDrive\\Desktop\\io\\hello.jpg");

		int ch = in.read();

		while (ch != -1) {

			out.write(ch);

			ch = in.read();

		}
		out.close();
		in.close();
	}
}
