package fechaYhora.MonthDay;

import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.Month;

public class MonthDayIs {

	public static void main(String[] args) {
		
		MonthDay d1 = MonthDay.of( Month.AUGUST, 13);
		System.out.println("d1               :" + d1);
		
		MonthDay d2 = MonthDay.of(Month.APRIL, 13);
		System.out.println("d2               :" + d2);
		
		System.out.println("d1 es after?  :" + d1.isAfter(d2));
		System.out.println("d1 es before? :" + d1.isBefore(d2));
		System.out.println("d1 es =?      :" + d1.equals(d2));
		System.out.println("d1 compareTo  :" + d1.compareTo(d2));
		
		boolean ms = d1.isSupported(ChronoField.MILLI_OF_SECOND);
		boolean dw = d1.isSupported(ChronoField.DAY_OF_WEEK);
		boolean dm = d1.isSupported(ChronoField.DAY_OF_MONTH);
		
		System.out.println("Soporta ChronoField.MILLI_OF_SECOND:"+ms);
		System.out.println("Soporta ChronoField.DAY_OF_WEEK    :"+dw);
		System.out.println("Soporta ChronoField.DAY_OF_MONTH   :"+dm);
		
		
		System.out.println("d1 es valido para 2022             :" + d1.isValidYear(2022));
	}

}
