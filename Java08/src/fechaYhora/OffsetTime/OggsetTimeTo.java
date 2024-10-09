package fechaYhora.OffsetTime;

import java.time.OffsetTime;

public class OggsetTimeTo {

	public static void main(String[] args) {
		OffsetTime ahora = OffsetTime.now();
		
		System.out.println("OffsetTime : " + ahora);
		System.out.println("LocalTime  : " 
				+ ahora.toLocalTime());	

	}

}
