package fechaYhora.MonthDay;

import java.time.Clock;
import java.time.MonthDay;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class MonthDayWith {

	public static void main(String[] args) {
		
		MonthDay hoy = MonthDay.now();		
		System.out.println("Hoy        :" + hoy);
		
		MonthDay d20 = hoy.withDayOfMonth(20);
		System.out.println("d20        :" + d20);

		MonthDay cambioMes = hoy.withMonth(8);
		System.out.println("cambioMes  :" + cambioMes);
  
		MonthDay cambioAny = hoy.with(Month.MARCH);
		System.out.println("cambioMes2 :" + cambioAny);
	}

}
