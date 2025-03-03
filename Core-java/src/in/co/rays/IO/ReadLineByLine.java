package in.co.rays.IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineByLine {
	
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("C:\\Users\\pc\\OneDrive\\Desktop\\io\\hello.txt");
		
		BufferedReader bf = new BufferedReader(fr);
		
		String line = bf.readLine();
		
		while (line != null) {
			
			System.out.println(line);

			line = bf.readLine();
		}
		bf.close();
		fr.close();
	}

}
