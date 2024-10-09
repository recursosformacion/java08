package fechaYhora.OffsetDateTime;

import java.time.OffsetDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class OffsetDateTimeUntil {

	public static void main(String[] args) {
		
		OffsetDateTime d1 = 
				OffsetDateTime.of(2022, 3, 13,20,35,0,0,ZoneOffset.MAX);
		System.out.println("d1               :" + d1);
		
		OffsetDateTime d2 = 
				OffsetDateTime.of(2022, 4, 13,20,35,0,0,ZoneOffset.MAX);
		System.out.println("d2               :" + d2);
		
		long dias = d1.until(d2,ChronoUnit.DAYS);
		System.out.println("Dias             :" + dias);
		
		long horas = d1.until(d2, ChronoUnit.HOURS);
		System.out.println("Horas            :" + horas);

	}

}
