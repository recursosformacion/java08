package fechaYhora.instant;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class InstantWith {

	public static void main(String[] args) {
		// crea un instant
        String texto = "2016-10-26T12:31:00.00Z";
        Instant fijo = Instant.parse(texto);
        System.out.println("fijo   : " + fijo);
        
        fijo = fijo.with(Instant.EPOCH);
        System.out.println("modif   : " + fijo);
        
        Instant modif1 = fijo.with(ChronoField.INSTANT_SECONDS, 10);
        System.out.println("modif1   : " + modif1);
 
        
        
    }

}
