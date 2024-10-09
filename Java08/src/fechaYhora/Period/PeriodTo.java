package fechaYhora.Period;

import java.time.Period;

public class PeriodTo {

public static void main(String[] args) {
	
	Period per1 = Period.of(5,14,50);
	System.out.println("Period.of         : " + per1);

	System.out.println("toString          : " + per1.toString());
	System.out.println("toTotalMonths     : " + per1.toTotalMonths());
	

}

}
