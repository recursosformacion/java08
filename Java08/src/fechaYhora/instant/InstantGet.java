package fechaYhora.instant;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class InstantGet {

	public static void main(String[] args) {
		Instant i1 = Instant.parse("2022-11-20T16:55:30.00Z");
		
		System.out.println("Instant1: " + i1);

		long value = i1.getLong(ChronoField.INSTANT_SECONDS);
		System.out.println("en segundos: " + value);

	}

}
