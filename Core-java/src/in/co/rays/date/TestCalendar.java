package in.co.rays.date;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 15);
		Date NextEvent = cal.getTime();
		System.out.println(NextEvent);
	}

}
