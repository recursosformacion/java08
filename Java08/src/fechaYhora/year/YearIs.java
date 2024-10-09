package fechaYhora.year;

import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.Year;
import java.time.Month;
import java.time.MonthDay;

public class YearIs {

public static void main(String[] args) {

	Year d1 = Year.of(2022);
	System.out.println("d1               :" + d1);

	Year d2 = Year.of(2020);

	System.out.println("d1               :" + d1);
	System.out.println("d2               :" + d2);
	System.out.println("d1.isAfter(d2 )  :" + d1.isAfter(d2));
	System.out.println("d1.equals(d2)    :" + d1.equals(d2));
	System.out.println("d1.compareTo(d2) :" + d1.compareTo(d2));
	System.out.println("d1 es bisiesto?  :" + d1.isLeap());

	System.out.println("2024 es bisiesto?:" + Year.isLeap(2024));

	boolean ms = d1.isSupported(ChronoField.MILLI_OF_SECOND);
	boolean dw = d1.isSupported(ChronoField.YEAR);
	boolean mo = d1.isSupported(ChronoUnit.MONTHS);

	System.out.println("Soporta ChronoField.MILLI_OF_SECOND:" + ms);
	System.out.println("Soporta ChronoField.YEAR           :" + dw);
	System.out.println("Soporta ChronoUnit.MONTHS          :" + mo);

	MonthDay mesdia = MonthDay.of(7, 20);
	System.out.println("es mes/dia valido?                 :" + d1.isValidMonthDay(mesdia));

}

}
