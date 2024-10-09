package fechaYhora.OffsetDateTime;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class OffsetDateTimeFormat {

	public static void main(String[] args) {

		OffsetDateTime hoy =  OffsetDateTime
				.parse("2018-12-12T13:30:30+05:00");
		DateTimeFormatter dtf = DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter dfu = DateTimeFormatter.ISO_TIME;

		String formattedDate = dtf.format(hoy);
		System.out.println("LONG format     : " + formattedDate);
		String formattedDateU = dfu.format(hoy);
		System.out.println("Full time format: " + formattedDateU);

		formattedDate = hoy.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
		System.out.println("MEDIUM format   : " + formattedDate);

		formattedDate = hoy.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
		System.out.println("SHORT format    : " + formattedDate);

		String formateado = hoy
				.format(DateTimeFormatter.ofPattern("dd - MMM - yy    hh:mm"));

		System.out.println("Formato manual..: " + formateado);
	}

}
