package interfaces.consumer.intconsumer;

import java.util.function.IntConsumer;

public class EjConsumer {

	public static void main(String[] args) {
		IntConsumer c = (x) -> System.out.println(x);
		
		c.accept(135);
		
		//Presentara por consola: 135
	}

}
