package fechaYhora.clock;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class ClockEjemplo {

	public static void main(String[] args) {

		Clock clock = Clock.systemDefaultZone();
		System.out.println("Clock:" + clock);

		Instant instant = clock.instant();
		System.out.println("Instante:" + instant);

		clock = Clock.systemUTC();
		System.out.println("Tiempo UTC :: " + clock.instant());

		clock = Clock.system(ZoneId.of("America/Mexico_City"));
		System.out.println("Hora Mexico_City:" + clock.instant());

		clock = Clock.systemDefaultZone();
		System.out.println("En milis:" + clock.millis());

		clock = Clock.offset(clock, Duration.ofHours(48));
		System.out.println("Dos dias despues:" + clock.instant());

		Clock clockDefaultZone = Clock.systemDefaultZone();
		Clock clocktick = Clock.tick(clockDefaultZone, Duration.ofSeconds(30));

		System.out.println("Clock Default Zone: " + clockDefaultZone.instant());
		System.out.println("Clock redondeada: " + clocktick.instant());

		// tiempo instantáneo actual en segundos completos para la zona horaria dada
		ZoneId zoneId = ZoneId.of("Asia/Calcutta");
		Clock clock1 = Clock.tickSeconds(zoneId);
		System.out.println("Redondeando a segundos:" + clock1.instant());

		// tiempo instantáneo del reloj en minutos completos para la zona horaria
		// especificada
		ZoneId zoneId2 = ZoneId.of("Asia/Calcutta");
		Clock clock2 = Clock.tickMinutes(zoneId2);
		System.out.println("Redondeando a minutos:" + clock2.instant());
		// Clock clock = Clock.tick(Clock.system(ZoneId.of("Asia/Calcutta")),
		// Duration.ofMinutes(1));

		// obteniendo un reloj fijo
		Clock fixedClock = Clock.fixed(Instant.parse("2022-08-29T10:15:30.00Z"), ZoneId.of("Asia/Calcutta"));
		System.out.println("Con hora fijada:" + fixedClock.instant());
	}

}
