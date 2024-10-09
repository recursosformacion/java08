package fechaYhora.yearMonth;

import java.time.YearMonth;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZonedDateTime;

public class YearMonthatDay {

public static void main(String[] args) {
	  YearMonth aMes = YearMonth.of(2020,12);
	  System.out.println("aMes                : " + aMes); 
      LocalDate hoy = aMes.atDay(25);
      System.out.println("atDay               : " + hoy); 
      
      LocalDate despues = aMes.atEndOfMonth();
      System.out.println("fin de año          : " + despues);  

}

}
