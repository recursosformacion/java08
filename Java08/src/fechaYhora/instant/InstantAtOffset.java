package fechaYhora.instant;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class InstantAtOffset {

	public static void main(String[] args) {
		Instant instant = Instant.parse("2022-11-15T14:22:30.00Z");
		System.out.println("Instant: " + instant);

		ZoneOffset offset = ZoneOffset.ofTotalSeconds(7200);

		OffsetDateTime offsetDate = instant.atOffset(offset);

		System.out.println("Offset Fecha y hora: " + offsetDate);
		
		ZoneId zone = ZoneId.of("America/Mexico_City");
		ZonedDateTime result = instant.atZone(zone);
		System.out.println("ZonedDateTime: " + result);
	}

}
