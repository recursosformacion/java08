package fechaYhora.LocalDate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateMinus {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2016, Month.FEBRUARY, 13);
		date = date.minusDays(7); //resto 7 dias
		System.out.println(date); // 2016-02-06
		
		date = date.minusMonths(2); //resto 2 meses
		System.out.println(date); // 2015-12-06

		date = date.minus(100,ChronoUnit.DAYS); //resto 100 dias
		System.out.println(date); // 2015-08-28
	}

}
