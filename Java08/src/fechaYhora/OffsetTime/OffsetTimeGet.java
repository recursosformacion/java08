package fechaYhora.OffsetTime;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class OffsetTimeGet {

public static void main(String[] args) {
	OffsetTime ahora = OffsetTime.now();
	
	System.out.println("Ahora  :" + ahora.toString());
	System.out.println("hora   :" + ahora.getHour());	
	System.out.println("minuto :" + ahora.getMinute());	
	System.out.println("Segundo:" + ahora.getSecond());
	System.out.println("Nano   :" + ahora.getNano());
	System.out.println("Offset :" + ahora.getOffset());

	System.out.println("Minuto del dia  :" 
			+ ahora.get(ChronoField.MINUTE_OF_DAY));	
	System.out.println("Nano del dia    :" 
			+ 	ahora.getLong(ChronoField.NANO_OF_DAY));	
}

}
