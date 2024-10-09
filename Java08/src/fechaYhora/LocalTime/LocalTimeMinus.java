package fechaYhora.LocalTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeMinus {

	public static void main(String[] args) {
		
		LocalTime unaHora = LocalTime.of(10,35,20);
		unaHora = unaHora.minusHours(2); // resto dos horas
		System.out.println(unaHora); // presenta 08:35:20

		unaHora = unaHora.minusMinutes(1); // resto 1 minuto
		System.out.println(unaHora); // presenta 08:34:20

		unaHora = unaHora.minusSeconds(17);
		System.out.println(unaHora); // presenta 08:34:03

		unaHora = unaHora.minus(10000, ChronoUnit.MICROS); // 
		System.out.println(unaHora); // presenta 08:34:02.990

	}

}
