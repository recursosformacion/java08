package fechaYhora.year;

import java.time.Year;
import java.time.temporal.ChronoField;

public class YearLength {

public static void main(String[] args) {
	Year d1 = Year.of(2022);
	System.out.println("d1       :" + d1);
	
	System.out.println("dias     : " + d1.length());
	
}

}
