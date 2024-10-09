package fechaYhora.MonthDay;

import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class MonthDayFormat {

	public static void main(String[] args) {
		
		MonthDay hoy = MonthDay.now();

		String formattedDate="";	
		
		String formateado = hoy.format(DateTimeFormatter.ofPattern("dd - MMM "));

		System.out.println("Formato manual..: " + formateado);
			
	}

}
