package fechaYhora.year;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class YearAdjustInto {

public static void main(String[] args) {
	Year d1 = Year.of(2022);
	System.out.println("d1             : " + d1);
	
	LocalDate f1 = (LocalDate) d1.adjustInto(LocalDate.of(1950, 10, 1));
	System.out.println("Queda como     : " + f1);

}

}
