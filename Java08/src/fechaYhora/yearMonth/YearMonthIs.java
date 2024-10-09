package fechaYhora.yearMonth;

import java.time.YearMonth;
import java.time.Month;

public class YearMonthIs {

public static void main(String[] args) {
	
	YearMonth d1 = YearMonth.of(2022, Month.AUGUST);
	System.out.println("d1               :" + d1);
	System.out.println("d1 es bisiesto?  :" + d1.isLeapYear());
	
	YearMonth d2 = YearMonth.of(2024, Month.APRIL);
	System.out.println("d2               :" + d2);
	System.out.println("d2 es bisiesto?  :" + d2.isLeapYear());


}

}
