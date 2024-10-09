package fechaYhora.MonthDay;

import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class MonthDayRange {

	public static void main(String[] args) {
		MonthDay hoy = MonthDay.now();
		
		System.out.println("Fecha           :" + 
				hoy.toString());
		
		System.out.println("Rango  dias mes        :" + 
				hoy.range(ChronoField.DAY_OF_MONTH));
		System.out.println("Rango  meses           :" + 
				hoy.range(ChronoField.MONTH_OF_YEAR));	
		
	}

}
