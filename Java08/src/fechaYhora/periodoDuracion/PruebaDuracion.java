package fechaYhora.periodoDuracion;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class PruebaDuracion {

	public static void main(String[] args) {
		Instant start = Instant.parse("2017-10-03T10:15:30.00Z");
		Instant end = Instant.parse("2017-10-03T10:16:30.00Z");
		        
		Duration duration = Duration.between(start, end);
		System.out.println("Duracion desde instant (s) " + duration.getSeconds());

		LocalTime startf = LocalTime.of(1, 20, 25, 1024);
		LocalTime endf = LocalTime.of(3, 22, 27, 1544);

		System.out.println("Duracion desde localTime (s) " + Duration.between(startf, endf).getSeconds());
		
		Duration fromChar1 = Duration.parse("P1DT1H10M10.5S");
		System.out.println("Duracion desde fromChar1 (s) " + fromChar1.getSeconds());
		
		Duration fromChar2 = Duration.parse("PT10M");
		System.out.println("Duracion desde fromChar2 (s) " + fromChar2.getSeconds());
		
		
		
	}

}
