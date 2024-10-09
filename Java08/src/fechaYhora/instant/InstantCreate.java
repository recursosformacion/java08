package fechaYhora.instant;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class InstantCreate {

	public static void main(String[] args) {
		//Fijar momento actual
		Instant ahora = Instant.now();
		
		//Fijar instante segun hora MX
		Clock clockMX = Clock.system(ZoneId.of("America/Mexico_City"));
		Instant ahoraMX = Instant.now(clockMX);
		
		Instant parseado = Instant.parse("2022-11-10T08:00:00.00Z");
		
		System.out.println("ahora   :" + ahora);
		System.out.println("ahoraMX :" + ahoraMX);
		System.out.println("parseado:" + parseado);
		
	}

}
