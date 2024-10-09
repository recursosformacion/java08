package fechaYhora.Period;

import java.time.Period;

public class PeriodMinus {

public static void main(String[] args) {
	Period per1 = Period.of(5,3,22);
	System.out.println("Period.of         : " + per1);
	
	Period per2 = per1.minusDays(5);
	System.out.println("Period.minusDays  : " + per2);
	
	Period per3 = per1.minusMonths(7);
	System.out.println("Period.minusMonths: " + per3);
	
	Period per4 = per1.minusYears(8);
	System.out.println("Period.minusYears : " + per4);

}

}
