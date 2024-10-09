package interfaces.consumer.doubleconsumer;

import java.util.function.DoubleConsumer ;

public class ConsumerAndThen {

	public static void main(String[] args) {

		DoubleConsumer  c = (x) -> System.out.println(x);
		DoubleConsumer  d = (x) -> System.out.println("He recibido:" +x);

		c.andThen(d).accept(Double.MAX_VALUE);
	}
	// Presentara por consola: 	1.7976931348623157E308
	//							He recibido:1.7976931348623157E308
}
