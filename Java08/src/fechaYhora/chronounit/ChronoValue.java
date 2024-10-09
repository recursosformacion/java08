package fechaYhora.chronounit;

import java.time.temporal.ChronoUnit;

public class ChronoValue {

	public static void main(String[] args) {

		// consigo un ChronoUnit
        ChronoUnit chronounit = ChronoUnit.valueOf("FOREVER");
  
        ChronoUnit[] array = chronounit.values();
  
        // presento todas las opciones
        for (int i = 0; i < array.length; i++)
            System.out.println((array[i] + "      ").substring(0,10) + " \t-" + array[i].getDuration());
    }
}
