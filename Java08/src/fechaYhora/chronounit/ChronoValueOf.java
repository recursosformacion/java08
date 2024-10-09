package fechaYhora.chronounit;

import java.time.temporal.ChronoUnit;

public class ChronoValueOf {

	public static void main(String[] args) {

		ChronoUnit mes = ChronoUnit.MONTHS;
		ChronoUnit mesm = ChronoUnit.valueOf("MONTHS");

		ver(mes);
		ver(mesm);
	}

	static void ver(ChronoUnit verlo) {
		System.out.println(verlo.toString() + " getDuration:" + verlo.getDuration());

	}

}
