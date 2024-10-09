package fechaYhora.duration;

import java.time.Duration;
import java.time.LocalTime;

public class DurationCompare {

	public static void main(String[] args) {
		
		LocalTime ini = LocalTime.MIN;
		LocalTime now = LocalTime.now();
		LocalTime fin = LocalTime.MAX;
		
		Duration di = Duration.between(ini, now);
		Duration df = Duration.between(now, fin);
		int c = di.compareTo(df);
		
		System.out.println(di);
		System.out.println(df);
		System.out.println(c);
	}

}
