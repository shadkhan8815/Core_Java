package in.co.rays.IO;

import java.io.FileReader;
import java.util.Scanner;

public class ReadByScanner {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("C:\\Users\\pc\\OneDrive\\Desktop\\io\\hello.txt");

		Scanner sc = new Scanner(file);

		while (sc.hasNext()) {

			System.out.println(sc.nextLine());

		}
		file.close();
		sc.close();
	}
}
