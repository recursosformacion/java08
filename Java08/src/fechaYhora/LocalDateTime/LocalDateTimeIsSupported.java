package fechaYhora.LocalDateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeIsSupported {

	public static void main(String[] args) {
		
		LocalDateTime d1 = LocalDateTime.of(2022, Month.AUGUST, 13,20,25);
		boolean ms = d1.isSupported(ChronoField.MILLI_OF_SECOND);
		boolean dw = d1.isSupported(ChronoField.DAY_OF_WEEK);
		boolean mo = d1.isSupported(ChronoUnit.MONTHS);
		
		System.out.println("Soporta ChronoField.MILLI_OF_SECOND:"+ms);
		System.out.println("Soporta ChronoField.DAY_OF_WEEK:"+dw);
		System.out.println("Soporta ChronoUnit.MONTHS:"+mo);
	

	}

}
