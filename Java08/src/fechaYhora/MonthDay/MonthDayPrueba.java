package fechaYhora.MonthDay;

import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.Month;

public class MonthDayPrueba {

	public static void main(String[] args) {
		
		MonthDay d1 = MonthDay.of( Month.MARCH, 13);
		System.out.println("d1               :" + d1);
		
		MonthDay d2 = MonthDay.of(Month.MARCH, 15);
		System.out.println("d2               :" + d2);
		
		
		System.out.println("d1 compareTo  :" + d1.compareTo(d2));
		int compa = d1.compareTo(d2);
		System.out.println(compa);
		
	}

}
