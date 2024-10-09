package fechaYhora.LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTimeFormat {

	public static void main(String[] args) {

		LocalDateTime hoy = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter dfu = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);

		String formattedDate = dtf.format(hoy);
		System.out.println("LONG format     : " + formattedDate);

		formattedDate = hoy.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
		System.out.println("MEDIUM format   : " + formattedDate);

		formattedDate = hoy.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
		System.out.println("SHORT format    : " + formattedDate);

		String formateado = hoy.format(DateTimeFormatter.ofPattern("dd - MMM - yy    hh:mm"));

		System.out.println("Formato manual..: " + formateado);

	}

}
