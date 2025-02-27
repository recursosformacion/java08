package fechaYhora;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ForeverTodosDuration {

	public static void main(String[] args) {
		for (final ChronoUnit unit : ChronoUnit.values()) {
		    final Duration duration = unit.getDuration();
		    System.out.println(unit + ": " + duration + " (" + duration.getSeconds() + " seconds)");
		}

	}

}
