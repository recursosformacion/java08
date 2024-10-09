package fechaYhora.Month;

import java.time.Month;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class MonthIsSupported {

	public static void main(String[] args) {
		
		Month d1 = Month.of(8);
		boolean ms = d1.isSupported(ChronoField.MILLI_OF_SECOND);
		boolean dw = d1.isSupported(ChronoField.DAY_OF_WEEK);
		boolean dm = d1.isSupported(ChronoField.MONTH_OF_YEAR);
		
		
		System.out.println("Soporta ChronoField.MILLI_OF_SECOND:"+ms);
		System.out.println("Soporta ChronoField.DAY_OF_WEEK:"+dw);
		System.out.println("Soporta ChronoField.MONTH_OF_YEAR:"+dm);
	

	}

}
