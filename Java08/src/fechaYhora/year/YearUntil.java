package fechaYhora.year;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class YearUntil {

public static void main(String[] args) {
	Year d1 = Year.of(2022);
	System.out.println("d1        :" + d1);
	
	LocalDate f1 = LocalDate.of(2021, 5,20);
	
	System.out.println("until     : " + d1.until(f1,ChronoUnit.YEARS));
	
}

}
