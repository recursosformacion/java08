package fechaYhora.LocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateUntil {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(2022, Month.AUGUST, 13);
		System.out.println("d1               :" + d1);
		
		LocalDate d2 = LocalDate.of(2057, Month.APRIL, 15);
		System.out.println("d2               :" + d2);
		
		Period p = d1.until(d2);
		System.out.println("Period           :" + p);
		
		long dias = d1.until(d2, ChronoUnit.DAYS);
		System.out.println("Dias             :" + dias);

	}

}
