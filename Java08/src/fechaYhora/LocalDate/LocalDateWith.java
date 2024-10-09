package fechaYhora.LocalDate;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class LocalDateWith {

	public static void main(String[] args) {
		
		LocalDate hoy = LocalDate.now();		
		System.out.println("Hoy        :" + hoy);
			
		LocalDate d10 = hoy.with(ChronoField.DAY_OF_MONTH,10);
		System.out.println("d10        :" + d10);
		
		LocalDate dlm = hoy.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("dlm        :" + dlm);
		
		LocalDate d20 = hoy.withDayOfMonth(20);
		System.out.println("d20        :" + d20);
		
		LocalDate dAny = hoy.withDayOfYear(364);
		System.out.println("dAny       :" + dAny);
		
		LocalDate cambioMes = hoy.withMonth(8);
		System.out.println("cambioMes  :" + cambioMes);
  
		LocalDate cambioAny = hoy.withYear(2034);
		System.out.println("cambioAny  :" + cambioAny);
	}

}
