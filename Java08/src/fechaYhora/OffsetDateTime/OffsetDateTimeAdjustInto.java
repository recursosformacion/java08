package fechaYhora.OffsetDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Year;
import java.time.ZonedDateTime;

public class OffsetDateTimeAdjustInto {

	public static void main(String[] args) {
		
		OffsetDateTime date = OffsetDateTime.now();
	      System.out.println(date);  

	      LocalTime date1 = LocalTime.parse("20:15");
	      date = (OffsetDateTime)date1.adjustInto(date);
	      System.out.println(date);  

	      LocalDateTime date2 = LocalDateTime.now();
	      System.out.println(date2);  	      
	}

}
