package fechaYhora.Period;

import java.time.Period;

public class PeriodCreate {

public static void main(String[] args) {
	
	Period per1 = Period.of(5,2,0);
	System.out.println("Period.of       : " + per1);
	
	Period per2 = Period.ofDays(120);
	System.out.println("Period.ofDays   : " + per2);
	
	Period per3 = Period.ofMonths(5);
	System.out.println("Period.ofMonths : " + per3);
	
	Period per4 = Period.ofWeeks(8);
	System.out.println("Period.ofWeeks  : " + per4);
	
	Period per5 = Period.ofYears(1);
	System.out.println("Period.ofYears  : " + per5);

	Period per6 = Period.parse("P2Y5M1D");
	System.out.println("Period.parse    : " + per6);

}

}
