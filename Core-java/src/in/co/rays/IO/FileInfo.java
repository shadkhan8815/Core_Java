package in.co.rays.IO;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\pc\\OneDrive\\Desktop\\io\\hello.txt");
		
		if (f.exists()) {
			System.out.println("name:" + f.getName());
			System.out.println("path:" + f.getAbsolutePath());
			
			System.out.println("accessible permission");
			System.out.println("readable:" + f.canRead());
			System.out.println("writeable" + f.canWrite());
			
			System.out.println("file:" + f.isFile());
			System.out.println("directory:" + f.isDirectory());
			
			Date d = new Date();
			System.out.println(d);
			
			long length = f.length();
			System.out.println(length);
			
		}
		else {
			System.out.println("file does not exist");
		}
	}
}
