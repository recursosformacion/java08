package fechaYhora.OffsetDateTime;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.Month;

public class OffsetDateTimePlus {

	public static void main(String[] args) {
		
		OffsetDateTime date = OffsetDateTime.of(2018, 12, 25,10, 45,30,14725,ZoneOffset.UTC);
		date = date.plusDays(2); // sumo dos dias
		System.out.println(date); // 2018-12-27T10:45:30.000014725Z

		date = date.plusWeeks(1); // sumo 1 semana a 2018-12-27T10:45:30.000014725Z
		System.out.println(date); // 2019-01-03T10:45:30.000014725Z

		date = date.plusMonths(28); // sumo 28 meses
		System.out.println(date); // presenta 2021-05-03T10:45:30.000014725Z

		date = date.plusYears(1); // suma un año
		System.out.println(date); // 2022-05-03T10:45:30.000014725Z
		
		date = date.plusHours(5); // sumo 5 horas
		System.out.println(date); // 2022-05-03T15:45:30.000014725Z

	}

}
