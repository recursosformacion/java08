package fechaYhora.duration;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class DurationGetUnits {

	public static void main(String[] args) {
		
		Duration ej = Duration.ofDays(5);
		List<TemporalUnit> a =	ej.getUnits();
		a.forEach(valor -> {
			System.out.println((valor + "      ").substring(0,10) + " \t-" + valor.getDuration());
		});
		           
	}

}
