package fechaYhora.LocalTime;

import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalTimePlus {

	public static void main(String[] args) {
		
		LocalTime unaHora = LocalTime.of(10,35,20);
		unaHora = unaHora.plusHours(2); // sumo dos horas
		System.out.println(unaHora); // presenta 212:35:20

		unaHora = unaHora.plusMinutes(1); // sumo 1 minuto
		System.out.println(unaHora); // presenta 12:36:20

		unaHora = unaHora.plusSeconds(17);
		System.out.println(unaHora); // presenta 12:36:37

		unaHora = unaHora.plus(10000, ChronoUnit.MICROS); // 
		System.out.println(unaHora); // presenta 12:36:37.010

	}

}
