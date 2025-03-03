package in.co.rays.IO;

import java.io.FileReader;

public class ReadCharByChar {
	
public static void main(String[] args) throws Exception {
	
	FileReader fr = new FileReader("C:\\Users\\pc\\OneDrive\\Desktop\\io\\hello.txt");
	
	int ch = fr.read();
	
	while(ch != -1) {
		System.out.print((char) ch);
		
		ch = fr.read();
	}
}

}
