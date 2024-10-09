package fechaYhora.LocalDateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeMinus {

	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.of(2016, Month.FEBRUARY, 13,20,15);
		date = date.minusDays(7); //resto 7 dias
		System.out.println(date); // 2016-02-06T20:15
		
		date = date.minusMonths(2); //resto 2 meses
		System.out.println(date); // 2015-12-06T20:15

		date = date.minus(100,ChronoUnit.DAYS); //resto 100 dias
		System.out.println(date); // 2015-08-28T20:15
		
		date = date.minusHours(2); //resto 2 horas
		System.out.println(date); // 2015-08-28T18:15
		
		
		
	}

}
