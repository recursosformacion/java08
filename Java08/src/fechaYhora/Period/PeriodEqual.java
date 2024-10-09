package fechaYhora.Period;

import java.time.Period;

public class PeriodEqual {

public static void main(String[] args) {
	
	Period per1 = Period.of(5,14,50);
	System.out.println("per1         : " + per1);

	Period per2 = Period.of(5,14,50);
	System.out.println("per2         : " + per2);
	System.out.println("son iguales? : " + per1.equals(per2));
	
}

}
