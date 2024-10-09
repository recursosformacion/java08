package fechaYhora.OffsetTime;

import java.time.OffsetTime;
import java.time.Duration;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.Month;

public class OffsetTimePlus {

public static void main(String[] args) {
	
	OffsetTime hora = OffsetTime.of(10, 45,30,14725,ZoneOffset.UTC);
	
	hora = hora.plusHours(5); // sumo 5 horas
	System.out.println(hora); // 15:45:30.000014725Z
	
	hora = hora.plus(20, ChronoUnit.MINUTES); // sumo 20 minutos
	System.out.println(hora); // 16:05:30.000014725Z
	
	hora = hora.plusMinutes(35); // sumo 35 minutos
	System.out.println(hora); // 16:40:30.000014725Z
	
	hora = hora.plus(Duration.ofHours(1)); // sumo 1 horas
	System.out.println(hora); // 17:40:30.000014725Z

}

}
