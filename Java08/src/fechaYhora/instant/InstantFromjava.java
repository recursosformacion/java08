package fechaYhora.instant;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class InstantFromjava {

	public static void main(String[] args) {
		// crea ZonedDateTime 
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        String texto = "2016-10-26T12:31:00.00Z";
        // crea  Instant 
        Instant result = Instant.from(zonedDateTime);
        Instant mas = Instant.from(DateTimeFormatter.RFC_1123_DATE_TIME.parse("Tue, 3 Jun 2008 11:05:30 GMT"));
        Instant fijo = Instant.parse(texto);

        System.out.println("Instant: " + result);
        System.out.println("mas    : " + mas);
        System.out.println("fijo   : " + fijo);
 
    }

}
