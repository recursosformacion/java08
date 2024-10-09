package fechaYhora;
//https://www.benchresources.net/java-8-what-are-all-the-temporal-units-supported-by-localdate/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;

public class UnidadesSoportadas {

	public static void main(String[] args) {
		// get current system date
        LocalDate localDate = LocalDate.now();
        System.out.println("Current system date is = " + localDate);
        testSoportado(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("Current system time is = " + localTime);
        testSoportado(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current system datetime is = " + localDateTime);
        testSoportado(localDateTime);
        
        
	}
	
	public static void testSoportado(Temporal pruebas) {
		String nombre = pruebas.getClass().getCanonicalName();
 
        //      •DAYS 
        //      •WEEKS 
        //      •MONTHS 
        //      •YEARS 
        //      •DECADES 
        //      •CENTURIES 
        //      •MILLENNIA 
        //      •ERAS 
        //      Except above, all other ChronoUnit instances will return false
 
 
        // 1. check ChronoUnit.DAYS field supported ?
        System.out.println("1. " + nombre + ".isSupported(ChronoUnit.DAYS) ? " + 
                pruebas.isSupported(ChronoUnit.DAYS));
 
 
        // 2. check ChronoUnit.WEEKS field supported ?
        System.out.println("2. " + nombre + ".isSupported(ChronoUnit.WEEKS) ? " + 
                pruebas.isSupported(ChronoUnit.WEEKS));
 
 
        // 3. check ChronoUnit.MONTHS field supported ?
        System.out.println("3. " + nombre + ".isSupported(ChronoUnit.MONTHS) ? " + 
                pruebas.isSupported(ChronoUnit.MONTHS));
 
 
        // 4. check ChronoUnit.YEARS field supported ?
        System.out.println("4. " + nombre + ".isSupported(ChronoUnit.YEARS) ? " + 
                pruebas.isSupported(ChronoUnit.YEARS));
 
 
        // 5. check ChronoUnit.DECADES field supported ?
        System.out.println("5. " + nombre + ".isSupported(ChronoUnit.DECADES) ? " + 
                pruebas.isSupported(ChronoUnit.DECADES));
 
 
        // 6. check ChronoUnit.CENTURIES field supported ?
        System.out.println("6. " + nombre + ".isSupported(ChronoUnit.CENTURIES) ? " + 
                pruebas.isSupported(ChronoUnit.CENTURIES));
 
 
        // 7. check ChronoUnit.MILLENNIA field supported ?
        System.out.println("7. " + nombre + ".isSupported(ChronoUnit.MILLENNIA) ? " + 
                pruebas.isSupported(ChronoUnit.MILLENNIA));
 
 
        // 8. check ChronoUnit.ERAS field supported ?
        System.out.println("8. " + nombre + ".isSupported(ChronoUnit.ERAS) ? " + 
                pruebas.isSupported(ChronoUnit.ERAS));
        
//      •NANOS 
        //      •MICROS 
        //      •MILLIS 
        //      •SECONDS 
        //      •MINUTES 
        //      •HOURS 
        //      •HALF_DAYS 
        //      •FOREVER
        //      Above ChronoUnit instances will return false
 
 
        // 1. check ChronoUnit.NANOS field supported ?
        System.out.println("1. " + nombre + ".isSupported(ChronoUnit.NANOS) ? " + 
                pruebas.isSupported(ChronoUnit.NANOS));
 
 
        // 2. check ChronoUnit.MICROS field supported ?
        System.out.println("2. " + nombre + ".isSupported(ChronoUnit.MICROS) ? " + 
                pruebas.isSupported(ChronoUnit.MICROS));
 
 
        // 3. check ChronoUnit.MILLIS field supported ?
        System.out.println("3. " + nombre + ".isSupported(ChronoUnit.MILLIS) ? " + 
                pruebas.isSupported(ChronoUnit.MILLIS));
 
 
        // 4. check ChronoUnit.SECONDS field supported ?
        System.out.println("4. " + nombre + ".isSupported(ChronoUnit.SECONDS) ? " + 
                pruebas.isSupported(ChronoUnit.SECONDS));
 
 
        // 5. check ChronoUnit.MINUTES field supported ?
        System.out.println("5. " + nombre + ".isSupported(ChronoUnit.MINUTES) ? " + 
                pruebas.isSupported(ChronoUnit.MINUTES));
 
 
        // 6. check ChronoUnit.HOURS field supported ?
        System.out.println("6. " + nombre + ".isSupported(ChronoUnit.HOURS) ? " + 
                pruebas.isSupported(ChronoUnit.HOURS));
 
 
        // 7. check ChronoUnit.HALF_DAYS field supported ?
        System.out.println("7. " + nombre + ".isSupported(ChronoUnit.HALF_DAYS) ? " + 
                pruebas.isSupported(ChronoUnit.HALF_DAYS));
 
 
        // 8. check ChronoUnit.FOREVER field supported ?
        System.out.println("8. " + nombre + ".isSupported(ChronoUnit.FOREVER) ? " + 
                pruebas.isSupported(ChronoUnit.FOREVER));

	}

}
