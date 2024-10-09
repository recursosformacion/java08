package fechaYhora.Period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodWith {

public static void main(String[] args) {
	Period per1 = Period.of(5,3,22);
	System.out.println("Period.of         : " + per1);
	
	Period per2 = per1.withDays(5);
	System.out.println("Period.withDays   : " + per2);
	
	Period per3 = per1.withMonths(7);
	System.out.println("Period.withMonths : " + per3);
	
	Period per4 = per1.withYears(8);
	System.out.println("Period.withYears  : " + per4);
	
	Period per5 = per1.from(Period.of(6, 0, 0));
	System.out.println("Period.from       : " + per5);
	
	LocalDate f1 = LocalDate.parse("2022-10-12");
	LocalDate f2 = LocalDate.parse("2022-11-13");
	Period per6 = per1.between(f1, f2);
	System.out.println("Period.between    : " + per6);
	

}

}
