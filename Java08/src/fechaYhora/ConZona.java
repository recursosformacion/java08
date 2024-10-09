package fechaYhora;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//zonas en https://code2care.org/pages/java-timezone-list-utc-gmt-offset
public class ConZona {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("UTC"));
		System.out.println("Current Date Time (UTC/GMT): " + localDateTime);
		
		ZoneId zoneNewYork = ZoneId.of("America/New_York"); 
		ZonedDateTime currentTimeNewYork = ZonedDateTime.now (zoneNewYork);
		System.out.println("Hora NuevaYork: " + currentTimeNewYork);
		
		ZoneId zoneChicago = ZoneId.of("America/Chicago"); 
		ZonedDateTime nowChicago = currentTimeNewYork.withZoneSameInstant(zoneChicago);
		System.out.println("Hora Chicago: " + nowChicago);
		
		ZoneId zoneBuenosAires = ZoneId.of("America/Buenos_Aires"); 
		ZonedDateTime nowBuenosAires = currentTimeNewYork.withZoneSameInstant(zoneBuenosAires);
		System.out.println("Hora BuenosAires: " + nowBuenosAires);
		
		ZoneId zoneSp = ZoneId.of("Europe/Madrid"); 
		ZonedDateTime nowSp = currentTimeNewYork.withZoneSameInstant(zoneSp);
		System.out.println("Hora Epain: " + nowSp);
		
		ZonedDateTime  zDT = ZonedDateTime.now();
		DayOfWeek diaSem = zDT.getDayOfWeek();
		System.out.println("Dia de la semana: " + diaSem);
		
		Instant instantNow = Instant.now();
		System.out.print("Instante: "+ instantNow);
        DayOfWeek dayOfWeek = LocalDateTime.ofInstant(instantNow, ZoneId.of("UTC")).getDayOfWeek();
        System.out.println(dayOfWeek);
	}

}
