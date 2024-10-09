package fechaYhora.LocalDateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTimeGet {

	public static void main(String[] args) {
		LocalDateTime d1 = LocalDateTime.of(2022, Month.AUGUST, 13, 10, 22);
		
		System.out.println("Dia semana     : " + d1.getDayOfWeek());
		System.out.println("Dia del mes    : " + d1.get(ChronoField.DAY_OF_MONTH));
		System.out.println("Mes            : " + d1.get(ChronoField.MONTH_OF_YEAR));
		System.out.println("Hora           : " + d1.get(ChronoField.HOUR_OF_DAY));
		System.out.println("Mes            : " + d1.getMonth());
		System.out.println("Mes numero     : " + d1.getMonthValue());
		System.out.println("Nano           : " + d1.getNano());
		
	}

}
