package interfaces.consumer;

import java.util.function.Consumer;

public class ConsumerAndThen {

	public static void main(String[] args) {
		
		Consumer<String> c = 
				(x) -> System.out.println(x.toLowerCase());
		Consumer<String> d = 
				(x) -> System.out.println("Esta claro? -> " + x.toLowerCase());
				
		c.andThen(d).accept("PRUEBAS");
	}
			//Presentara por consola: pruebas
			//                        Esta claro? -> pruebas
}
