package fechaYhora.year;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class YearFormat {

public static void main(String[] args) {
	Year d1 = Year.of(2022);
	System.out.println("d1             : " + d1);
	String formateado = d1.format(DateTimeFormatter.ofPattern("yy"));
	
	
	System.out.println("con formato yy : " + formateado);
	
}

}
