package fechaYhora.periodoDuracion;

import java.time.LocalDate;
import java.time.Period;

public class PruebaPeriodo {

	public static void main(String[] args) {

		Period fromUnits = Period.of(3, 10, 10);
		System.out.println("From units " + fromUnits.toString());
		Period fromDays = Period.ofDays(50);
		System.out.println("From days " + fromDays.toString());
		Period fromMonths = Period.ofMonths(5);
		System.out.println("From month " + fromMonths.toString());
		Period fromYears = Period.ofYears(10);
		System.out.println("From year " + fromYears.toString());
		Period fromWeeks = Period.ofWeeks(40);
		System.out.println("From week " + fromWeeks.toString());
		
		LocalDate startDate = LocalDate.of(2020, 2, 20);
		LocalDate endDate = LocalDate.of(2022, 1, 15);

		Period period = Period.between(startDate, endDate);
		System.out.println("From period " + period.toString());
		Period fromCharYears = Period.parse("P2Y");
		Period fromCharUnits = Period.parse("P2Y3M5D");
	}

}
