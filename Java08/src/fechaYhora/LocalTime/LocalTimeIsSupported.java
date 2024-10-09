package fechaYhora.LocalTime;

import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeIsSupported {

	public static void main(String[] args) {
		
		LocalTime d1 = LocalTime.of(7,40);
		boolean ms = d1.isSupported(ChronoField.MILLI_OF_SECOND);
		boolean dw = d1.isSupported(ChronoField.DAY_OF_WEEK);
		boolean mo = d1.isSupported(ChronoUnit.MONTHS);
		
		System.out.println("Soporta ChronoField.MILLI_OF_SECOND:"+ms);
		System.out.println("Soporta ChronoField.DAY_OF_WEEK:"+dw);
		System.out.println("Soporta ChronoUnit.MONTHS:"+mo);
	

	}

}
