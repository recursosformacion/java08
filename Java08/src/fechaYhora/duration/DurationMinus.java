package fechaYhora.duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

public class DurationMinus {

	public static void main(String[] args) {
		//Obtener Duration desde numero de dias
		Duration ej = Duration.ofHours(1);		//1 hora
		System.out.println(ej.getSeconds());
		
		Duration mi20 = Duration.ofMinutes(20);
		System.out.println(mi20.getSeconds());
		
		Duration mi40 = ej.minus(mi20);
		System.out.println(mi40.getSeconds());
		
		Duration mi30 = mi40.minusMinutes(10);
		System.out.println(mi30.getSeconds());
		
	}

}
