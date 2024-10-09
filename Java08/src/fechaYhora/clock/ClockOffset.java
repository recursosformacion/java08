package fechaYhora.clock;

import java.time.Clock;
import java.time.Duration;

public class ClockOffset {

	public static void main(String[] args) {
		// hora actual
        Clock real = Clock.systemDefaultZone();
        System.out.println("Hora actual: "
                           + real.instant());
  
        // Creamos otro Clock sin desplazamiento
        Clock clock = Clock.offset(real, Duration.ZERO);
        System.out.println("Hora "
                           + " con Duration = 0 : "
                           + clock.instant());
  
        // Nuevo Clock con desplazamiento de 24 horas positivas
        clock = Clock.offset(real, Duration.ofHours(24));
        System.out.println("Hora "
                           + " con Duration = 24hours : "
                           + clock.instant());
  
        // Nuevo Clock con desplazamiento de 24 horas negativas
        clock = Clock.offset(real, Duration.ofHours(-24));
        System.out.println("Hora "
                           + " con Duration = -24hours : "
                           + clock.instant());

	}

}
