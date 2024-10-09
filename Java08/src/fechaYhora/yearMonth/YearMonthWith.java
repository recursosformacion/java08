package fechaYhora.yearMonth;

import java.time.YearMonth;
import java.time.temporal.ChronoField;

public class YearMonthWith {

public static void main(String[] args) {
	
	YearMonth ames = YearMonth.now();		
	System.out.println("Año-Mes    :" + ames);
		
	YearMonth d10 = ames.with(ChronoField.MONTH_OF_YEAR,10);
	System.out.println("d10        :" + d10);
	
	YearMonth cambioMes = ames.withMonth(8);
	System.out.println("cambioMes  :" + cambioMes);
  
		YearMonth cambioAny = ames.withYear(2034);
		System.out.println("cambioAny  :" + cambioAny);
}

}
