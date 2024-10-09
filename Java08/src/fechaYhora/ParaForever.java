package fechaYhora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

public class ParaForever {

	public static void main(String[] args) {
		Duration d = ChronoUnit.FOREVER.getDuration();
		int approximateYears = (int) (d.toDays() / 365.2425);
		System.out.println(approximateYears);
		main2();
		LocalDate localDate = LocalDate.of(2012, 11, 23);
	    System.out.println(localDate.plus(3, ChronoUnit.DAYS)); //2012-11-26

	    System.out.println(localDate.plus(Period.ofDays(3))); //2012-11-26
	    try {// w w w. j a  v  a 2  s .c o  m
	        //System.out.println(localDate.plus(Duration.ofDays(3)));

	        System.out.println(localDate.plus(4, ChronoUnit.FOREVER));
	    } catch (UnsupportedTemporalTypeException e) {
	    	System.out.println("Errores...................");
	        e.printStackTrace();
	    }
	}
	
	public static void main2()
    {
  
        // get ChronoUnit
        ChronoUnit chronounit
            = ChronoUnit.valueOf("FOREVER");
  
        // apply values()
        ChronoUnit[] array
            = chronounit.values();
  
        // print
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

}
