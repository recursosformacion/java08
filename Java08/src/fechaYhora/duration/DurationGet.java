package fechaYhora.duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

public class DurationGet {

	public static void main(String[] args) {
		//Obtener Duration desde numero de dias
		Duration ej = Duration.ofHours(1);		//1 hora
		
		System.out.println(ej.get(ChronoUnit.SECONDS));
		System.out.println(ej.getSeconds());
		

	}

}
