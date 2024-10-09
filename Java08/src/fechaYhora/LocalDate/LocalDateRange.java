package fechaYhora.LocalDate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateRange {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		
		System.out.println("Fecha           :" + 
				hoy.toString());
		
		System.out.println("Rango  dias mes        :" + 
				hoy.range(ChronoField.DAY_OF_MONTH));
		System.out.println("Rango  dias año        :" + 
				hoy.range(ChronoField.DAY_OF_YEAR));	
		

	}

}
