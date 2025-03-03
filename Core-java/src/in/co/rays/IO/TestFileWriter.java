package in.co.rays.IO;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("C:\\Users\\pc\\OneDrive\\Desktop\\io\\hello.txt");
		
       file.write("hello\n");
		
		file.write("my name is shad khan...!");
		
		file.close();
	}
}