package fechaYhora.LocalDateTime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateTimeCreate {

	public static void main(String[] args) {

		LocalDateTime hoy = LocalDateTime.now();

		Clock clock = Clock.systemDefaultZone();
		LocalDateTime hoyDef = LocalDateTime.now(clock);
		LocalDateTime hoyMX = LocalDateTime.now(ZoneId.of("America/Mexico_City"));

		System.out.println("Hoy        :" + hoy);
		System.out.println("Hoy Def    :" + hoyDef);
		System.out.println("Hoy MX     :" + hoyMX);
//---of				
		System.out.println("con hora   :" + 
					LocalDateTime.of(2021, 10, 29, 10, 45));
		System.out.println("con nanos  :" + 
					LocalDateTime.of(2021, 10, 29, 10, 45, 18, 123456));
		System.out.println("Julio      :" + 
					LocalDateTime.of(2021, Month.JULY, 29, 10, 45, 18, 123456));
//-- con LocalDate y LocalTime
		LocalDate uno = LocalDate.of(2020, 9, 15);
		LocalTime unoT = LocalTime.of(14, 10, 0);
		System.out.println("Local??    :" + 
					LocalDateTime.of(uno, unoT));
//ofEpoch, ofYear		
		System.out.println("ofEpoch    :" + 
					LocalDateTime.ofEpochSecond(123456789L, 98765, ZoneOffset.UTC));
// parse		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm");

		System.out.println("dParse     :" + 
					LocalDateTime.parse("2020-08-15T07:35"));
		System.out.println("dParseF    :" +
					LocalDateTime.parse("12 febrero 2020 17:50", formato));
// from		
		System.out.println("dFrom      :" + 
				LocalDateTime.from(ZonedDateTime.now()));
	}

}
