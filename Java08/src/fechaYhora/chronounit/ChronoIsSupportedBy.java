package fechaYhora.chronounit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoIsSupportedBy {

	public static void main(String[] args) {
		
		ChronoUnit decada = ChronoUnit.DECADES;
		ChronoUnit any = ChronoUnit.YEARS;
		ChronoUnit mes = ChronoUnit.MONTHS;
		ChronoUnit dia = ChronoUnit.DAYS;
		ChronoUnit horas = ChronoUnit.HOURS;
		ver(decada);
		ver(any);
		ver(mes);
		ver(dia);
		ver(horas);
		

	}
	static void ver(ChronoUnit verlo) {
		System.out.println(verlo.toString() 
				+ " isSupportedBy:" + verlo.isSupportedBy(LocalDate.now()));
		
	}

}
