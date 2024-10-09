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
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class InstantTruncate {

	public static void main(String[] args) {
		// crea un instant
        String texto = "2016-10-26T12:31:20.00Z";
        Instant base = Instant.parse(texto);
        System.out.println("base        : " + base);
        
        Instant aminutos = base.truncatedTo(ChronoUnit.MINUTES);
        System.out.println("A minutos   : " + aminutos);
        
        Instant ahoras = base.truncatedTo(ChronoUnit.HOURS);
        System.out.println("A Horas     : " + ahoras);
 
        
        
    }

}
