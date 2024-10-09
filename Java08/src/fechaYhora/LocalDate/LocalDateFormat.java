package fechaYhora.LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateFormat {

	public static void main(String[] args) {
		
		LocalDate hoy = LocalDate.now();

		String formattedDate = hoy.format(DateTimeFormatter
		    .ofLocalizedDate(FormatStyle.LONG));
		System.out.println("LONG format     : " + formattedDate);

		formattedDate = hoy.format(DateTimeFormatter
		    .ofLocalizedDate(FormatStyle.MEDIUM));
		System.out.println("MEDIUM format   : " + formattedDate);

		formattedDate = hoy.format(DateTimeFormatter
		    .ofLocalizedDate(FormatStyle.SHORT));
		System.out.println("SHORT format    : " + formattedDate);

		formattedDate = hoy.format(DateTimeFormatter
		    .ofLocalizedDate(FormatStyle.FULL));
		System.out.println("FULL format     : " + formattedDate);
		
		String formateado = hoy.format(DateTimeFormatter.ofPattern("dd - MMM - yy"));

		System.out.println("Formato manual..: " + formateado);
			
	}

}
