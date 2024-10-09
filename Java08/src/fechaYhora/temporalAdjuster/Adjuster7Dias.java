package fechaYhora.temporalAdjuster;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Adjuster7Dias {

	public static void main(String[] args) {
		
//		TemporalAdjuster mas7 = t -> { 
//			Temporal nuevo = t.plus(Period.ofDays(7));
//			nuevo = nuevo.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
//			return nuevo;
//		};
		TemporalAdjuster mas7 = t -> t.plus(Period.ofDays(7)).with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		
		LocalDate hoy = LocalDate.now();
		LocalDate envio = hoy.with(mas7);
		System.out.println("Estamos a    :" + hoy);
		System.out.println("El envio será:" + envio);;
	}

}
