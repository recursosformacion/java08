package fechaYhora.duration;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMM {

	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();
		Duration h1 = Duration.ofHours(3);
		
		LocalTime antes = (LocalTime)h1.subtractFrom(now);
		LocalTime despues = (LocalTime)h1.addTo(now);
		
		System.out.println("Ahora  :" + now);
		System.out.println("Antes  :" + antes);
		System.out.println("Despues:" + despues);
	}

}
