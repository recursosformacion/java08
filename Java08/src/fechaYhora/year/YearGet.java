package fechaYhora.year;

import java.time.Year;
import java.time.temporal.ChronoField;

public class YearGet {

	public static void main(String[] args) {
		Year d1 = Year.of(2022);
		System.out.println("d1               :" + d1);
		
		System.out.println("ChronoField.YEAR   : " + d1.get(ChronoField.YEAR));
		System.out.println("ChronoField.YEAR   : " + d1.getLong(ChronoField.YEAR));
		System.out.println("getValue           : " + d1.getValue());
	}

}
