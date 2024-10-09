package interfaces.consumer.longconsumer;

import java.util.function.LongConsumer ;

public class ConsumerAndThen {

	public static void main(String[] args) {

		LongConsumer  c = (x) -> System.out.println(x);
		LongConsumer  d = (x) -> System.out.println("He recibido:" +x);

		c.andThen(d).accept(Long.MAX_VALUE);
	}
	// Presentara por consola: 	9223372036854775807
	//							He recibido:9223372036854775807
}
