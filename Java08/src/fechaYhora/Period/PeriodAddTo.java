package fechaYhora.Period;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.ZonedDateTime;

public class PeriodAddTo {

public static void main(String[] args) {

	LocalDate date = LocalDate.now();
	System.out.println(date);
	Period per1 = Period.of(5,14,50);

	LocalDate date1 = (LocalDate) per1.addTo(date);
	
	System.out.println(date1);

}

}
