package fechaYhora.yearMonth;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class YearMonthFormat {

public static void main(String[] args) {
	
	YearMonth ames = YearMonth.now();

	String formattedDate = "";		
	String formateado = ames.format(DateTimeFormatter.ofPattern("MMM - yy"));
	System.out.println("Formato manual..: " + formateado);
		
}

}
