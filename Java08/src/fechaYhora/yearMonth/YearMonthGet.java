package fechaYhora.yearMonth;

import java.time.YearMonth;
import java.time.temporal.ChronoField;

public class YearMonthGet {

public static void main(String[] args) {
	YearMonth aMes = YearMonth.now();
	
	System.out.println("Fecha           :" + 
			aMes.toString());
	System.out.println("Numero mes      :" + 
			aMes.getMonthValue());	
	System.out.println("Año             :" + 
			aMes.getYear());
	System.out.println("Mes        Obj  :" + 
			aMes.getMonth());
	
	System.out.println("----------------------------------------");
	
	System.out.println("El año          :" + 
			aMes.getLong(ChronoField.YEAR));
	
	System.out.println("----------------------------------------");
	
}

}
