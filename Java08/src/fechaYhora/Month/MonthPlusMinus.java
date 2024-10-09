package fechaYhora.Month;

import java.time.Month;

public class MonthPlusMinus {

	public static void main(String[] args) {
		Month febrero = Month.of(2);
		System.out.println("febrero   : " + febrero);

		Month mas3 = febrero.plus(3);
		System.out.println("mas3      : " + mas3);

		Month menos2 = febrero.minus(2);
		System.out.println("menos2    : " + menos2);

	}

}
