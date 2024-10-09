package fechaYhora.OffsetTime;

import java.time.OffsetTime;
import java.time.Duration;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class OffsetTimeMinus {

public static void main(String[] args) {
	
	OffsetTime hora = OffsetTime.of(10, 45,30,14725,ZoneOffset.UTC);
	
	hora = hora.minusHours(5); // resto 5 horas
	System.out.println(hora); // 05:45:30.000014725Z
	
	hora = hora.minus(20, ChronoUnit.MINUTES); // resto 20 minutos
	System.out.println(hora); // 05:25:30.000014725Z
	
	hora = hora.minusMinutes(35); // resto 35 minutos
	System.out.println(hora); // 04:50:30.000014725Z
	
	hora = hora.minus(Duration.ofHours(1)); // resto 1 horas
	System.out.println(hora); // 03:50:30.000014725Z


}

}
