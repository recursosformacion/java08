package fechaYhora;

import java.time.Clock;
import java.time.Instant;
import java.time.OffsetTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
 
public class OffsetTimePr {
 
    public static void main(String[] args) {
        OffsetTime offsetTime1 = OffsetTime.now();
        System.out.println("OffsetTime1: " + offsetTime1);
 
        OffsetTime offsetTime2 = OffsetTime.now(Clock.systemUTC());
        System.out.println("OffsetTime2: " + offsetTime2);
        
        OffsetTime offsetTime3 = OffsetTime.now(ZoneId.of("Asia/Jakarta"));
        System.out.println("OffsetTime3: " + offsetTime3);
        
        OffsetTime offsetTime4 = OffsetTime.of(20, 15, 45, 345875000, ZoneOffset.of("+07:00"));
        System.out.println("OffsetTime4: " + offsetTime4);
        
        OffsetTime offsetTime5 = OffsetTime.of(LocalTime.of(15, 50, 25), ZoneOffset.of("+07:00"));
        System.out.println("OffsetTime5: " + offsetTime5);
        
        OffsetTime offsetTime6 = OffsetTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("OffsetTime6: " + offsetTime6);
        
        OffsetTime offsetTime7 = OffsetTime.parse("10:15:30+07:00");
        System.out.println("OffsetTime7: " + offsetTime7);
        
        OffsetTime offsetTime8 = OffsetTime.parse("18:30:15+08:00", DateTimeFormatter.ISO_OFFSET_TIME);
        System.out.println("OffsetTime8: " + offsetTime8);
    }
}
