package fechaYhora.duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

public class DurationPlus {

	public static void main(String[] args) {
		//Obtener Duration desde numero de dias
		Duration ej = Duration.ofMinutes(10);		//10 minutos
		System.out.println(ej.getSeconds());
		
		Duration mi20 = Duration.ofMinutes(20);
		System.out.println(mi20.getSeconds());
		
		Duration mi40 = ej.plus(mi20);
		System.out.println(mi40.getSeconds());
		
		Duration mi50 = mi40.plusMinutes(10);
		System.out.println(mi50.getSeconds());
		
	}

}
