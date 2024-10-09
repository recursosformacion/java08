package fechaYhora.yearMonth;

import java.time.YearMonth;
import java.time.temporal.ChronoField;

public class YearMonthLength {

public static void main(String[] args) {
	YearMonth hoy = YearMonth.now();
	
	System.out.println("Año/mes               :" + 
			hoy.toString());
	
	System.out.println("Longitud mes          :" + 
			hoy.lengthOfMonth());
	System.out.println("Longitud año          :" + 
			hoy.lengthOfYear());	
}

}
