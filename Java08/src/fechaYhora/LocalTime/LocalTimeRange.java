package fechaYhora.LocalTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeRange {

	public static void main(String[] args) {
		LocalTime ahora = LocalTime.now();
		
		System.out.println("Hora           :" + 
				ahora.toString());
		
		System.out.println("Rango  horas        :" + 
				ahora.range(ChronoField.HOUR_OF_DAY));
		System.out.println("Rango  minutos      :" + 
				ahora.range(ChronoField.MINUTE_OF_HOUR));	
		System.out.println("Rango  segundos      :" + 
				ahora.range(ChronoField.SECOND_OF_MINUTE));	
		System.out.println("Rango  minutos en dia:" + 
				ahora.range(ChronoField.MINUTE_OF_DAY));	

	}

}
