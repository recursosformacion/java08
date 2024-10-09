package fechaYhora.OffsetDateTime;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;

public class OffsetDateTimeRange {

	public static void main(String[] args) {
		OffsetDateTime hoy = OffsetDateTime.now();
		
		System.out.println("Fecha                     :" + 
				hoy.toString());
		
		System.out.println("Rango  dias mes           :" + 
				hoy.range(ChronoField.DAY_OF_MONTH));
		System.out.println("Rango  dias año           :" + 
				hoy.range(ChronoField.DAY_OF_YEAR));
		System.out.println("Rango  segundos por minuto:" + 
				hoy.range(ChronoField.SECOND_OF_MINUTE));	
		System.out.println("Rango  segundos por dia   :" + 
				hoy.range(ChronoField.SECOND_OF_DAY));
		

	}

}
