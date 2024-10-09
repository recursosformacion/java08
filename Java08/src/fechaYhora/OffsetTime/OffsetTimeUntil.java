package fechaYhora.OffsetTime;

import java.time.OffsetTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class OffsetTimeUntil {

public static void main(String[] args) {
	
	OffsetTime d1 = OffsetTime.parse("10:42+02:00");
	System.out.println("d1               :" + d1);
	
	OffsetTime d2 = OffsetTime.parse("10:43+06:00");
	System.out.println("d2               :" + d2);
	
	long h = d1.until(d2,ChronoUnit.HOURS);
	System.out.println("en horas             :" + h);
	
	long p = d1.until(d2,ChronoUnit.MINUTES);
	System.out.println("en minutos           :" + p);
	
	long r = d1.until(d2, ChronoUnit.SECONDS);
	System.out.println("en segundos          :" + r);

}

}
