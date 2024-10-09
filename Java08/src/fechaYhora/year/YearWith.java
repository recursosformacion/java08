package fechaYhora.year;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class YearWith {

public static void main(String[] args) {
	
	Year an1 = Year.of(1999);
	System.out.println("an1   : " + an1);
	
	Year an2 = an1.with(Year.of(2010));
	System.out.println("an2   : " + an2);
	
	Year an3 = an1.with(ChronoField.YEAR, 2015);
	System.out.println("an3   : " + an3);
}

}
