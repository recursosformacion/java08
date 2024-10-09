package fechaYhora.LocalTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.ZonedDateTime;

public class LocalTimeAdjustInto {

	public static void main(String[] args) {
		
		ZonedDateTime date = ZonedDateTime.now();
	      System.out.println(date);  

	      LocalTime date1 = LocalTime.parse("14:37:00");
	      date = (ZonedDateTime)date1.adjustInto(date);
	      System.out.println(date);  

	}

}
