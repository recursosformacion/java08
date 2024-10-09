package fechaYhora.year;

import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class YearPlusMinus {

public static void main(String[] args) {
	
	Year base = Year.of(2020);
	
	Year mas1 = base.plusYears(1);
	Year mas2 = base.plus(2, ChronoUnit.YEARS);
	Year mas3 = base.plus(Period.of(3, 0, 0));
	
	System.out.println("base           : " + base);
	System.out.println("base  mas1     : " + mas1);
	System.out.println("base  mas2     : " + mas2);
	System.out.println("base  mas3     : " + mas3);
	
	Year menos1 = base.minusYears(1);
	Year menos2 = base.minus(2, ChronoUnit.YEARS);
	Year menos3 = base.minus(Period.of(3, 0, 0));
	
	System.out.println("base  menos1   : " + menos1);
	System.out.println("base  menos2   : " + menos2);
	System.out.println("base  menos3   : " + menos3);
}

}
