package fechaYhora.LocalDateTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeRange {

	public static void main(String[] args) {
		LocalDateTime hoy = LocalDateTime.now();
		
		System.out.println("Fecha           :" + 
				hoy.toString());
		
		System.out.println("Rango  dias mes        :" + 
				hoy.range(ChronoField.DAY_OF_MONTH));
		System.out.println("Rango  dias año        :" + 
				hoy.range(ChronoField.DAY_OF_YEAR));
		System.out.println("Rango  segundos por minuto       :" + 
				hoy.range(ChronoField.SECOND_OF_MINUTE));	
		System.out.println("Rango  segundos por dia          :" + 
				hoy.range(ChronoField.SECOND_OF_DAY));
		

	}

}
