package fechaYhora;

import java.time.temporal.ChronoUnit;

public class EsBasadoEnFecha {

	public static void main(String[] args) {
		for (ChronoUnit unit : ChronoUnit.values()) {
		    if (unit.isDateBased()) {
		        System.out.println(unit.name());
		    } else {
		    	System.out.println('*' + unit.name());
		    }
		}

	}

}
