package interfaces.consumer.longconsumer;

import java.util.function.LongConsumer;

public class EjConsumer {

	public static void main(String[] args) {
		LongConsumer c = (x) -> System.out.println(x);
		
		c.accept(1234567890123456789L);
		
		//Presentara por consola: 1234567890123456789
	}

}
