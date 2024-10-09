package fechaYhora.LocalTime;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class LocalTimeCreate {

	public static void main(String[] args) {
		
		LocalTime ahora= LocalTime.now();
		
		Clock clock = Clock.systemDefaultZone();		
		LocalTime ahoraDef = LocalTime.now(clock);		
		LocalTime ahoraMX = LocalTime.now(ZoneId.of("America/Mexico_City"));
		
		System.out.println("Ahora        :" + ahora);
		System.out.println("Ahora Def    :" + ahoraDef);
		System.out.println("Ahora MX     :" + ahoraMX);
//---of		
		LocalTime unaHora = LocalTime.of(11, 40);
		LocalTime otraHora = LocalTime.of(12, 15 ,52);
		
		System.out.println("unaHora      :" + unaHora);
		System.out.println("otraHora    :" + otraHora);
//ofNanoDay		
		long nanos = unaHora.getLong(ChronoField.NANO_OF_DAY);
		nanos += 200000000000L;
		LocalTime desdeNanos = LocalTime.ofNanoOfDay(nanos);
		LocalTime desdesegundos  = LocalTime.ofSecondOfDay(72153);
		
		System.out.println("desdeNanos :" + desdeNanos);
		System.out.println("desdesegundos  :" + desdesegundos);
// parse		
		LocalTime dParse = LocalTime.parse("14:10:22");
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH mm ss");
        LocalTime dParseF = LocalTime.parse("12 50 21", formato);
        
        System.out.println("dParse     :" + dParse);
		System.out.println("dParseF    :" + dParseF);		
// from		
		LocalDateTime mas = LocalDateTime.now();
		LocalTime pFrom = LocalTime.from(mas);
		System.out.println("dFrom      :" + pFrom);	
	}

}
