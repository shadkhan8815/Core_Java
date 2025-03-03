package in.co.rays.IO;

import java.io.FileReader;

public class TryResources {

	public static void main(String[] args) throws Exception {
		
		try (FileReader in = new FileReader("C:\\Users\\pc\\OneDrive\\Desktop\\io\\hello.txt")) {

			int ch = in.read();

			while (ch != -1) {

				System.out.print((char) ch);

				ch = in.read();

			}
		}
    }
}
