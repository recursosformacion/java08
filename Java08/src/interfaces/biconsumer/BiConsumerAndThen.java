package interfaces.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerAndThen {

	public static void main(String[] args) {
		
		BiConsumer<String, Integer> presenta = (x,l) -> {
			String corta = x.substring(0, l);
			System.out.println(corta.toLowerCase());
		};
				
		presenta.andThen(presenta).accept("PRUEBAS",5);
	}
			//Presentara por consola: pruebas
			//                        Esta claro? -> pruebas
}
