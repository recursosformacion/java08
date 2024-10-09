package fechaYhora.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeIsAfter {

	public static void main(String[] args) {

		LocalDateTime d1 = LocalDateTime.of(2022, Month.AUGUST, 13, 10, 22);
		LocalDateTime d2 = LocalDateTime.of(2022, Month.APRIL, 13, 15, 32);

		System.out.println("d1               :" + d1);
		System.out.println("d2               :" + d2);
		System.out.println("d1.isAfter(d2 )  :" + d1.isAfter(d2));	

	}

}
