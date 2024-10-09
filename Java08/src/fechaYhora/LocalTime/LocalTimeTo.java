package fechaYhora.LocalTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTo {

	public static void main(String[] args) {
		LocalTime ahora = LocalTime.now();
		
		System.out.println("Fecha          :" + 
				ahora.toString());
		
		System.out.println("a segundos     :" + 
				ahora.toSecondOfDay());		
		System.out.println("a nanos        :" + 
				ahora.toNanoOfDay  ());	

	}

}
