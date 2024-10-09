package fechaYhora.temporalAdjuster;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class AdjusterDia {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		System.out.println("Estamos a    :" + hoy);
		
		//Segundo domingo del mes
		LocalDate fecha = hoy.with(TemporalAdjusters.dayOfWeekInMonth(2,DayOfWeek.SUNDAY));
		System.out.println("El segundo domingo del mes :" + fecha);

		//Segundo domingo del mes
		fecha = hoy.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("El primer dia del siguientel mes :" + fecha);
		
		//Segundo domingo DEL SIGUIENTE MES
		fecha = hoy.with(TemporalAdjusters.firstDayOfNextMonth())
				   .with(TemporalAdjusters.dayOfWeekInMonth(2,DayOfWeek.SUNDAY));
		System.out.println("El segundo domingo del siguiente mes :" + fecha);
	}

}
