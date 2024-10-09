package fechaYhora.LocalTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeWith {

	public static void main(String[] args) {
		
		LocalTime ahora = LocalTime.now();		
		System.out.println("Hoy        :" + ahora);
			
		LocalTime h21 = ahora.with(ChronoField.HOUR_OF_DAY,21);
		System.out.println("h21        :" + h21);
		
		LocalTime hmn = ahora.with(LocalTime.MIDNIGHT);
		System.out.println("hmn        :" + hmn);
		
		LocalTime h20 = ahora.withHour(20);
		System.out.println("h20        :" + h20);
		
		LocalTime cMinuto= ahora.withMinute(36);
		System.out.println("cMinuto    :" + cMinuto);
		
		LocalTime cambioNano = ahora.withNano(333);
		System.out.println("cambioNano :" + cambioNano);
  
		LocalTime cambioSegun = ahora.withSecond(45);
		System.out.println("cambioSegun:" + cambioSegun);
		
		LocalTime truncaH = ahora.truncatedTo(ChronoUnit.HOURS);
		System.out.println("truncaH    :" + truncaH);
	}

}
