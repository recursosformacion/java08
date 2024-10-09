package fechaYhora.OffsetDateTime;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class OffsetDateTimeIsSupported {

	public static void main(String[] args) {
		
		OffsetDateTime d1 = OffsetDateTime.of(2022, 9, 13,20,25,0,0,ZoneOffset.MIN);
		boolean ms = d1.isSupported(ChronoField.MILLI_OF_SECOND);
		boolean dw = d1.isSupported(ChronoField.DAY_OF_WEEK);
		boolean mo = d1.isSupported(ChronoUnit.MONTHS);
		
		System.out.println("Soporta ChronoField.MILLI_OF_SECOND:"+ms);
		System.out.println("Soporta ChronoField.DAY_OF_WEEK:"+dw);
		System.out.println("Soporta ChronoUnit.MONTHS:"+mo);
	

	}

}
