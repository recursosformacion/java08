package fechaYhora.MonthDay;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Year;
import java.time.ZonedDateTime;

public class MonthDayAtYear {

	public static void main(String[] args) {
		  MonthDay hoy = MonthDay.now();
		  System.out.println("hoy           : " + hoy); 
	      LocalDate ahora = hoy.atYear(2022);
	      System.out.println("con año       : " + ahora); 

	}

}
