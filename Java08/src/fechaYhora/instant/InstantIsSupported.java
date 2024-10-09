package fechaYhora.instant;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class InstantIsSupported {

	public static void main(String[] args) {
		Instant in = Instant.now();
		boolean ms = in.isSupported(ChronoField.MILLI_OF_SECOND);
		boolean dw = in.isSupported(ChronoField.DAY_OF_WEEK);
		boolean mo = in.isSupported(ChronoUnit.MONTHS);
		
		System.out.println("Soporta ChronoField.MILLI_OF_SECOND:"+ms);
		System.out.println("Soporta ChronoField.DAY_OF_WEEK:"+dw);
		System.out.println("Soporta ChronoUnit.MONTHS:"+mo);
	}

}
