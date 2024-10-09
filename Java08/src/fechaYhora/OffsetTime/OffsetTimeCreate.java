package fechaYhora.OffsetTime;

import java.time.Clock;
import java.time.Instant;
import java.time.OffsetTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetTimeCreate {

	public static void main(String[] args) {

		OffsetTime hoy = OffsetTime.now();

		Clock clock = Clock.systemDefaultZone();
		OffsetTime hoyDef = OffsetTime.now(clock);
		OffsetTime hoyMX = OffsetTime.now(ZoneId.of("America/Mexico_City"));
		
		System.out.println("Hoy        :" + hoy);
		System.out.println("Hoy Def    :" + hoyDef);
		System.out.println("Hoy MX     :" + hoyMX);
//---of				
		System.out.println("con detalle:" + 
					OffsetTime.of( 10, 45,30,14725,ZoneOffset.UTC));
		
//-- con LocalTime
		LocalTime unoT = LocalTime.of(14, 10, 0);
		ZoneOffset zoff = ZoneOffset.of("+02");
		System.out.println("Local??    :" + 
					OffsetTime.of(unoT, zoff));
//Instant
		Instant ins = Instant.now();
		System.out.println("Instant    :" + 
					OffsetTime.ofInstant(ins, zoff));
// parse		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

		System.out.println("dParse     :" + 
					OffsetTime.parse("10:15:30+01:00"));
// from		
		System.out.println("dFrom      :" + 
				OffsetTime.from(ZonedDateTime.now()));
	}

}
