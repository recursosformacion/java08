package fechaYhora;

import java.time.temporal.ChronoUnit;

public class EsEstimada {

	public static void main(String[] args) {
		for (ChronoUnit unit : ChronoUnit.values()) {
		    if (unit.isDurationEstimated()) {
		        System.out.println(unit.name());
		    } else {
		    	System.out.println('*' + unit.name());
		    }
		}
	}

}
