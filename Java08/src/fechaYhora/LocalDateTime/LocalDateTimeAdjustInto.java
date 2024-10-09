package fechaYhora.LocalDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.ZonedDateTime;

public class LocalDateTimeAdjustInto {

	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.now();
	      System.out.println(date);  

	      LocalTime date1 = LocalTime.parse("20:15");
	      date = (LocalDateTime)date1.adjustInto(date);
	      System.out.println(date);  

	}

}
