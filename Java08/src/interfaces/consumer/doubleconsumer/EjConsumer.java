package interfaces.consumer.doubleconsumer;

import java.util.function.DoubleConsumer;

public class EjConsumer {

	public static void main(String[] args) {
		DoubleConsumer c = (x) -> System.out.println(x);
		
		c.accept(Double.MAX_VALUE);
		
		//Presentara por consola: 1.7976931348623157E308
	}

}
