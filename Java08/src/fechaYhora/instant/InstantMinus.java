package fechaYhora.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantMinus {

	public static void main(String[] args) {
		// instante inicial
		Instant base = Instant.now();
		//quito 600 segundos(10 minutos)
		Instant m600s = base.minus(600,ChronoUnit.SECONDS);
		//quito 200 ms
		Instant m200ms = m600s.minusMillis(200);
		
		System.out.println("base                   :" + base);
		System.out.println("Menos 600 segundos     :" + m600s);
		System.out.println("Menos 200 milisegundos :" + m200ms);

	}

}
