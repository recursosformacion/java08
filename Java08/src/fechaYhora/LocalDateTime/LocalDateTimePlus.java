package fechaYhora.LocalDateTime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimePlus {

	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.of(2018, Month.DECEMBER, 25,20,37);
		date = date.plusDays(2); // sumo dos dias
		System.out.println(date); // 2018-12-27T20:37

		date = date.plusWeeks(1); // sumo 1 semana a 2018-12-27T20:37
		System.out.println(date); // presenta 2019-01-03T20:37

		date = date.plusMonths(28); // sumo 28 meses
		System.out.println(date); // presenta 2021-05-03T20:37

		date = date.plusYears(1); // suma un año
		System.out.println(date); // 2022-05-03T20:37
		
		date = date.plusHours(5); // sum0 5 horas
		System.out.println(date); // 2022-05-04T01:37

	}

}
