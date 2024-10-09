package fechaYhora.year;

import java.time.Year;
import java.time.temporal.ChronoField;

public class YearRange {

public static void main(String[] args) {
	Year d1 = Year.of(2022);
	System.out.println("d1        :" + d1);
	
	System.out.println("ValueRange: " + d1.range(ChronoField.MONTH_OF_YEAR));
	
}

}
