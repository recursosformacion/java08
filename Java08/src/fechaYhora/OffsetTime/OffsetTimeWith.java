package fechaYhora.OffsetTime;

import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;


public class OffsetTimeWith {

	public static void main(String[] args) {
		
		OffsetTime ahora = OffsetTime.now();		
		System.out.println("Hoy        :" + ahora);
				
		OffsetTime cambioHora = ahora.withHour(15);
		System.out.println("cambioHora :" + cambioHora);
		
		OffsetTime cambioZona = ahora.withOffsetSameInstant(ZoneOffset.UTC);
		System.out.println("cambioZona :" + cambioZona);
		
		OffsetTime cambioLocal = ahora.withOffsetSameLocal(ZoneOffset.MAX);
		System.out.println("cambioLocal:" + cambioLocal);
		
		
		OffsetTime truncadoMinutos = ahora.truncatedTo(ChronoUnit.MINUTES);
		System.out.println("truncadoMinutos :" + truncadoMinutos);
	}

}
