package in.co.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCustomCalendar {
	
	public static void main(String[] args) throws ParseException {
		
		String str = "30/01/2025" ;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date = sdf.parse(str);
		
		Calendar cal = Calendar.getInstance();
		
		//cal.setTime(date );
		
		cal.add(Calendar.DATE, 25);
		
		Date nextEvent = cal.getTime();
		
		System.out.println(sdf.format(nextEvent));
		
		
		
		
		
		
	}

}
