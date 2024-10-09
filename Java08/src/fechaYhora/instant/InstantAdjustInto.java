package fechaYhora.instant;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

public class InstantAdjustInto {

	public static void main(String[] args) {
		
		ZonedDateTime date = ZonedDateTime.now();
		
		System.out.println("Fijo:" + date);
		
		LocalDate date1 = LocalDate.parse("2015-01-31");
		
		date = (ZonedDateTime)date1.adjustInto(date);
		
		// print results
		System.out.println("Date " + date);

	}

}
