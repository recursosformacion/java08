package fechaYhora.LocalDateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeUntil {

	public static void main(String[] args) {
		
		LocalDateTime d1 = LocalDateTime.of(2022, Month.AUGUST, 13,20,35);
		System.out.println("d1               :" + d1);
		
		LocalDateTime d2 = LocalDateTime.of(2024, Month.APRIL, 13,10,35);
		System.out.println("d2               :" + d2);
		
		long dias = d1.until(d2,ChronoUnit.DAYS);
		System.out.println("Dias            :" + dias);
		
		long horas = d1.until(d2, ChronoUnit.HOURS);
		System.out.println("Horas           :" + horas);

	}

}
