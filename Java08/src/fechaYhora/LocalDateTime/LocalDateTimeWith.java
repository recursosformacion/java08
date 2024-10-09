package fechaYhora.LocalDateTime;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class LocalDateTimeWith {

	public static void main(String[] args) {
		
		LocalDateTime hoy = LocalDateTime.now();		
		System.out.println("Hoy        :" + hoy);
			
		LocalDateTime d10 = hoy.with(ChronoField.DAY_OF_MONTH,10);
		System.out.println("d10        :" + d10);
		
		LocalDateTime dlm = hoy.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("dlm        :" + dlm);
		
		LocalDateTime d20 = hoy.withDayOfMonth(20);
		System.out.println("d20        :" + d20);
		
		LocalDateTime dAny = hoy.withDayOfYear(364);
		System.out.println("dAny       :" + dAny);
		
		LocalDateTime cambioMes = hoy.withMonth(8);
		System.out.println("cambioMes  :" + cambioMes);
  
		LocalDateTime cambioAny = hoy.withYear(2034);
		System.out.println("cambioAny  :" + cambioAny);
		
		LocalDateTime cambioHora = hoy.withHour(15);
		System.out.println("cambioHora :" + cambioHora);
		
		LocalDateTime truncadoMinutos = hoy.truncatedTo(ChronoUnit.MINUTES);
		System.out.println("truncadoMinutos :" + truncadoMinutos);
	}

}
