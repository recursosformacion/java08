package fechaYhora.yearMonth;

import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.Month;

public class YearMonthIsAfter {

public static void main(String[] args) {
	
	YearMonth d1 = YearMonth.of(2020, Month.AUGUST);
	System.out.println("d1               :" + d1);
	
	YearMonth d2 = YearMonth.of(2020,Month.APRIL);
	System.out.println("d2               :" + d2);
	
	System.out.println("d1 es after?  :" + d1.isAfter(d2));
	System.out.println("d1 es before? :" + d1.isBefore(d2));
	System.out.println("d1 es =?      :" + d1.equals(d2));
	System.out.println("d1 compareTo  :" + d1.compareTo(d2));

//	System.out.println("d1 es valido para 2022             :" + d1.isValidYear(2022));
}

}
