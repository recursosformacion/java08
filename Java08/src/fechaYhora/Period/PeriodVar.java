package fechaYhora.Period;

import java.time.Period;

public class PeriodVar {

public static void main(String[] args) {
	
	Period per1 = Period.of(5,14,50);
	System.out.println("Period.of         : " + per1);

	System.out.println("multiply * 4      : " + per1.multipliedBy(4));
	System.out.println("negated           : " + per1.negated());
	System.out.println("normalizad        : " + per1.normalized());

}

}
