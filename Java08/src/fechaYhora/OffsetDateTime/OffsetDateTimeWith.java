package fechaYhora.OffsetDateTime;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;


public class OffsetDateTimeWith {

	public static void main(String[] args) {
		
		OffsetDateTime hoy = OffsetDateTime.now();		
		System.out.println("Hoy        :" + hoy);
			
		OffsetDateTime d10 = hoy.with(ChronoField.DAY_OF_MONTH,10);
		System.out.println("d10        :" + d10);
		
		OffsetDateTime dlm = hoy.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("dlm        :" + dlm);
		
		OffsetDateTime d20 = hoy.withDayOfMonth(20);
		System.out.println("d20        :" + d20);
		
		OffsetDateTime dAny = hoy.withDayOfYear(364);
		System.out.println("dAny       :" + dAny);
		
		OffsetDateTime cambioMes = hoy.withMonth(8);
		System.out.println("cambioMes  :" + cambioMes);
  
		OffsetDateTime cambioAny = hoy.withYear(2034);
		System.out.println("cambioAny  :" + cambioAny);
		
		OffsetDateTime cambioHora = hoy.withHour(15);
		System.out.println("cambioHora :" + cambioHora);
		
		OffsetDateTime cambioZona = hoy.withOffsetSameInstant(ZoneOffset.UTC);
		System.out.println("cambioZona :" + cambioZona);
		
		OffsetDateTime cambioLocal = hoy.withOffsetSameLocal(ZoneOffset.MAX);
		System.out.println("cambioLocal :" + cambioLocal);
		
		
		OffsetDateTime truncadoMinutos = hoy.truncatedTo(ChronoUnit.MINUTES);
		System.out.println("truncadoMinutos :" + truncadoMinutos);
	}

}
