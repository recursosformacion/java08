package interfaces.consumer;

import java.util.function.Consumer;

public class EjConsumer {

	public static void main(String[] args) {
		Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
		
		c.accept("PRUEBAS");
		
		//Presentara por consola: pruebas
	}

}
