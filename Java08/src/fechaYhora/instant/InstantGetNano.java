package fechaYhora.instant;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class InstantGetNano {

	public static void main(String[] args) {
		Instant i1 = Instant.parse("2022-11-20T16:55:30.10Z");		
		System.out.println("Instant1: " + i1);

		long value = i1.getNano();
		System.out.println("en segundos: " + value);

	}

}
