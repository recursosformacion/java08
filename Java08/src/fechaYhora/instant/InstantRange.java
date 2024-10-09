package fechaYhora.instant;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.ValueRange;

public class InstantRange {

	public static void main(String[] args) {
		// instante inicial
		Instant base = Instant.now();
		ValueRange range1 = base.range(ChronoField.MILLI_OF_SECOND);
		ValueRange range2 = base.range(ChronoField.MICRO_OF_SECOND);
		ValueRange range3 = base.range(ChronoField.NANO_OF_SECOND);
		System.out.println("base: " + base);
		System.out.println("   Rango en MILLI_OF_SECOND is: " + range1);
		System.out.println("   Rango en MICRO_OF_SECOND is: " + range2);
		System.out.println("   Rango en  NANO_OF_SECOND is: " + range3);

	}

}
