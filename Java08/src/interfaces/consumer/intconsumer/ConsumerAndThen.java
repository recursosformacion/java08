package interfaces.consumer.intconsumer;

import java.util.function.IntConsumer;

public class ConsumerAndThen {

	public static void main(String[] args) {

		IntConsumer c = (x) -> System.out.println(x);
		IntConsumer d = (x) -> System.out.println("He recibido:" +x);

		c.andThen(d).accept(20);
	}
	// Presentara por consola: 	20
	// 							He recibido:20
}
