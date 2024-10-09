package fechaYhora.chronounit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoIsBased {

public static void main(String[] args) {
		
		ChronoUnit decada = ChronoUnit.DECADES;
		ChronoUnit any = ChronoUnit.YEARS;
		ChronoUnit horas = ChronoUnit.HOURS;
		ver(decada);
		ver(any);
		ver(horas);
		

	}
	static void ver(ChronoUnit verlo) {
		System.out.println(verlo.toString() 
				+ " isDateBased:" + verlo.isDateBased());
		System.out.println(verlo.toString() 
				+ " isTimeBased:" + verlo.isTimeBased());
	}

}
