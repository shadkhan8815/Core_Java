package in.co.rays.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class SplitFile {

	public static void main(String[] args) throws Exception {
		try (BufferedReader bfr = new BufferedReader(
				new FileReader("C:\\Users\\pc\\OneDrive\\Desktop\\io\\hello.txt"))) {

			String[] lines = new String[10];

			for (int i = 0; i < 10; i++) {
				lines[i] = bfr.readLine();
				if (lines[i] == null) {
					System.out.println("file must have 10 lines");
				}
			}

			for (int i = 0; i < 5; i++) {
				String file = "file" + (i + 1) + ".txt";
				try (BufferedWriter bw = new BufferedWriter(
						new FileWriter("C:\\Users\\pc\\OneDrive\\Desktop\\io\\file"+i+".txt"))) {
					bw.write(lines[i * 2] + "\n");
					bw.write(lines[i * 2 + 1] + "\n");
				}
				System.out.println(file);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
