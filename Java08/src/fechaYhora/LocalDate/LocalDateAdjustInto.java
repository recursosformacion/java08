package fechaYhora.LocalDate;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZonedDateTime;

public class LocalDateAdjustInto {

	public static void main(String[] args) {
		
		ZonedDateTime date = ZonedDateTime.now();
	      System.out.println(date);  

	      LocalDate date1 = LocalDate.parse("2017-02-03");
	      date = (ZonedDateTime)date1.adjustInto(date);
	      System.out.println(date);  

	}

}
