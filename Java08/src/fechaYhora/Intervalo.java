package fechaYhora;

import java.time.Clock;
import java.time.Instant;

public class Intervalo {

	public static void main(String[] args) {
		
		Clock clock = Clock.systemDefaultZone();
		Instant start = clock.instant();
		
		// todas las instrucciones que quieras
		
		for (int a=1;a<10000;a++) {
			System.out.println(a);
		}
		
		Instant end = clock.instant();
		System.out.println("Tiempos:" + start + "/" + end);
	}
}
