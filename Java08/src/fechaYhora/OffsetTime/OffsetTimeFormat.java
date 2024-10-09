package fechaYhora.OffsetTime;

import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class OffsetTimeFormat {

public static void main(String[] args) {
	
	OffsetTime ahora = OffsetTime.now();

	String formattedTime = ahora.format(DateTimeFormatter.ISO_TIME);
	System.out.println("LONG format     : " + formattedTime);

	formattedTime = ahora.format(DateTimeFormatter
	    .ofLocalizedTime(FormatStyle.MEDIUM));
	System.out.println("MEDIUM format   : " + formattedTime);

	formattedTime = ahora.format(DateTimeFormatter
	    .ofLocalizedTime(FormatStyle.SHORT));
	System.out.println("SHORT format    : " + formattedTime);
	
	String formateado = ahora.format(DateTimeFormatter.ofPattern("HH - mm - ss ZZZZ"));
	System.out.println("Formato manual..: " + formateado);
		
}

}
