package fechaYhora.duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

public class DurationCreate {

	public static void main(String[] args) {
		// Obtener Duration desde numero de dias
		Duration ej = Duration.ofDays(5); // 5 dias
		Duration ddias = Duration.from(ej); // lo mismo que ej
		Duration unDia = Duration.of(24, ChronoUnit.HOURS);

		System.out.println(ej);
		System.out.println(ddias);
		System.out.println(unDia);
	}

}
