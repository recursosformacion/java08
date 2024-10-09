package fechaYhora.LocalTime;

import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalTimeUntil {

	public static void main(String[] args) {
		
		LocalTime d1 = LocalTime.of(10,43);
		System.out.println("d1               :" + d1);
		
		LocalTime d2 = LocalTime.of(15,42,22);
		System.out.println("d2               :" + d2);
		
		long p = d1.until(d2,ChronoUnit.MINUTES);
		System.out.println("en minutos           :" + p);
		
		long r = d1.until(d2, ChronoUnit.SECONDS);
		System.out.println("en segundos          :" + r);

	}

}
