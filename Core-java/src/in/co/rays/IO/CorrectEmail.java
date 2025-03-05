package in.co.rays.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CorrectEmail {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("C:\\Users\\pc\\OneDrive\\Desktop\\io\\emails.txt");

		BufferedReader bfr = new BufferedReader(fr);

		FileWriter fw = new FileWriter("C:\\Users\\pc\\OneDrive\\Desktop\\io\\correctemails.txt");

		PrintWriter pw = new PrintWriter(fw);

		String emailReg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		String line = bfr.readLine();

		while (line != null) {

			if (line.matches(emailReg)) {

				pw.println(line);
			}

			line = bfr.readLine();
		}
		pw.close();
		bfr.close();
		System.out.println("DONE");

	}

}
