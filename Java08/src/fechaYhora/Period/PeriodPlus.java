package fechaYhora.Period;

import java.time.Period;

public class PeriodPlus {

public static void main(String[] args) {
	Period per1 = Period.of(5,3,22);
	System.out.println("Period.of         : " + per1);
	
	Period per2 = per1.plusDays(5);
	System.out.println("Period.plusDays   : " + per2);
	
	Period per3 = per1.plusMonths(7);
	System.out.println("Period.plusMonths : " + per3);
	
	Period per4 = per1.plusYears(8);
	System.out.println("Period.plusYears  : " + per4);

}

}
