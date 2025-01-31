package in.co.rays.date;

import java.text.SimpleDateFormat;

import java.util.Date;


public class TestSimpleDateFormate {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String str = sdf.format(d);
		
		System.out.println(str);
	}
}

// convertion date formate to simlpe date formate ;
//                 OR
// we can say that the convertion of date to string ;