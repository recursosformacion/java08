package fechaYhora.yearMonth;

import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.Month;

public class YearMonthIsValid {

public static void main(String[] args) {
	
	YearMonth d1 = YearMonth.of(2022, Month.FEBRUARY);
	System.out.println("d1               :" + d1);
	
	YearMonth d2 = YearMonth.of(2020,Month.FEBRUARY);
	System.out.println("d2               :" + d2);
	
	System.out.println("d1 es after?  :" + d1.isValidDay(29));
	System.out.println("d1 es before? :" + d2.isValidDay(29));
	
}

}
