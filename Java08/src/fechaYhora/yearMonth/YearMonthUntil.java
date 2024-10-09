package fechaYhora.yearMonth;

import java.time.YearMonth;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class YearMonthUntil {

public static void main(String[] args) {
	
	YearMonth d1 = YearMonth.of(2022, Month.AUGUST);
	System.out.println("d1               :" + d1);
	
	YearMonth d2 = YearMonth.of(2024, Month.APRIL);
	System.out.println("d2               :" + d2);
	
	long p = d1.until(d2,ChronoUnit.YEARS);
	System.out.println("en años          :" + p);
	
	long meses = d1.until(d2,ChronoUnit.MONTHS);
	System.out.println("en meses         :" + meses);
	
	
}

}
