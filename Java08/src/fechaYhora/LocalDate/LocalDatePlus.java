package fechaYhora.LocalDate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDatePlus {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, Month.DECEMBER, 25);
		date = date.plusDays(2); // sumo dos dias
		System.out.println(date); // presenta 2018-12-27

		date = date.plusWeeks(1); // sumo 1 semana a 2018-12-27
		System.out.println(date); // presenta 2019-01-03

		date = date.plusMonths(1);
		System.out.println(date); // presenta la misma fecha un mes despues

		date = date.plusYears(1); // duma un año
		System.out.println(date); // 2020-02-03

	}

}
