package fechaYhora.Month;

import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class MonthGet {

	public static void main(String[] args) {
		Month d1 = Month.of(4);
		System.out.println("Numero mes   : " 
				+ d1.get(ChronoField.MONTH_OF_YEAR));
		
		Locale es = new Locale("es", "ES");
		Locale fr = Locale.FRENCH;
		
		System.out.println("Mes es       : " 
				+ d1.getDisplayName(TextStyle.FULL,es));
		System.out.println("Mes fr       : " 
				+ d1.getDisplayName(TextStyle.FULL,fr));
		
		System.out.println("getLong      : " 
				+ d1.getLong(ChronoField.MONTH_OF_YEAR));

		System.out.println("getValue     : " 
				+ d1.getValue());
	}

}
