package fechaYhora.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantPlus {

	public static void main(String[] args) {
		// instante inicial
		Instant base = Instant.now();
		//Añado 10 segundos
		Instant m10s = base.plus(10,ChronoUnit.SECONDS);
		
		long segundos = base.until(m10s, ChronoUnit.SECONDS);
		
		System.out.println("base                :" + base);
		System.out.println("Mas 10 segundos :" + m10s);
		System.out.println("Until en segundos:" + segundos);

	}

}
