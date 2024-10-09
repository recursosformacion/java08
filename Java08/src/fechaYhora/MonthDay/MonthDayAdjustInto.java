package fechaYhora.MonthDay;

import java.time.MonthDay;
import java.time.Year;
import java.time.ZonedDateTime;

public class MonthDayAdjustInto {

	public static void main(String[] args) {
		
		ZonedDateTime date = ZonedDateTime.now();
	      System.out.println(date);  

	      MonthDay date1 = MonthDay.parse("--02-03");
	      date = (ZonedDateTime)date1.adjustInto(date);
	      System.out.println(date);  

	}

}
