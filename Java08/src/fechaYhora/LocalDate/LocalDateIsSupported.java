package fechaYhora.LocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateIsSupported {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(2022, Month.AUGUST, 13);
		boolean ms = d1.isSupported(ChronoField.MILLI_OF_SECOND);
		boolean dw = d1.isSupported(ChronoField.DAY_OF_WEEK);
		boolean mo = d1.isSupported(ChronoUnit.MONTHS);
		
		System.out.println("Soporta ChronoField.MILLI_OF_SECOND:"+ms);
		System.out.println("Soporta ChronoField.DAY_OF_WEEK:"+dw);
		System.out.println("Soporta ChronoUnit.MONTHS:"+mo);
	

	}

}
