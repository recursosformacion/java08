package fechaYhora.chronounit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoAddTo {

	public static void main(String[] args) {
		
		LocalDateTime hoy = LocalDateTime.now();
		int numeralSemana = hoy.getDayOfWeek().getValue();
        LocalDateTime primerDiaSemana = ChronoUnit.DAYS.addTo(hoy, 1 - numeralSemana);
        System.out.println(primerDiaSemana);

	}

}
