package fechaYhora.OffsetDateTime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class OffsetDateTimeCreate {

	public static void main(String[] args) {

		OffsetDateTime hoy = OffsetDateTime.now();

		Clock clock = Clock.systemDefaultZone();
		OffsetDateTime hoyDef = OffsetDateTime.now(clock);
		OffsetDateTime hoyMX = OffsetDateTime.now(ZoneId.of("America/Mexico_City"));

		System.out.println("Hoy        :" + hoy);
		System.out.println("Hoy Def    :" + hoyDef);
		System.out.println("Hoy MX     :" + hoyMX);
//---of				
		System.out.println("con detalle:" + 
					OffsetDateTime.of(2021, 10, 29, 10, 45,30,14725,ZoneOffset.UTC));
		
//-- con LocalDate y LocalTime
		LocalDate uno = LocalDate.of(2020, 9, 15);
		LocalTime unoT = LocalTime.of(14, 10, 0);
		ZoneOffset zoff = ZoneOffset.of("+02");
		System.out.println("Local??    :" + 
					OffsetDateTime.of(uno, unoT, zoff));
//Instant
		Instant ins = Instant.now();
		System.out.println("Instant    :" + 
					OffsetDateTime.ofInstant(ins, zoff));
// parse		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm");

		System.out.println("dParse     :" + 
					OffsetDateTime.parse("2022-12-03T10:15:30+01:00"));
// from		
		System.out.println("dFrom      :" + 
				OffsetDateTime.from(ZonedDateTime.now()));
	}

}
