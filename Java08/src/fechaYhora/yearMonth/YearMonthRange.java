package fechaYhora.yearMonth;

import java.time.YearMonth;
import java.time.temporal.ChronoField;

public class YearMonthRange {

public static void main(String[] args) {
	YearMonth hoy = YearMonth.now();
	
	System.out.println("Fecha           :" + 
			hoy.toString());
	
	System.out.println("Rango  meses año:" + 
			hoy.range(ChronoField.MONTH_OF_YEAR));	
	System.out.println("Rango  años     :" + 
			hoy.range(ChronoField.YEAR));	
	

}

}
