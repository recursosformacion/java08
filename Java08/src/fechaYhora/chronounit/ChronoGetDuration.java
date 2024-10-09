package fechaYhora.chronounit;

import java.time.temporal.ChronoUnit;

public class ChronoGetDuration {

	public static void main(String[] args) {
		
		s("Forever     :" + ChronoUnit.FOREVER.getDuration());
		s("Eras en años:" + ChronoUnit.ERAS.getDuration().toDays()/365.2425);
		s("---------------------------------------------------------");
		s("Decadas   :" + ChronoUnit.DECADES.getDuration());
		s("En dias   :" + ChronoUnit.DECADES.getDuration().toDays());
		s("En Horas  :" + ChronoUnit.DECADES.getDuration().toHours());
		s("En minutos:" + ChronoUnit.DECADES.getDuration().toMinutes());
		
		
	}
	static void s(String salida) {
		System.out.println(salida);
	}

}
