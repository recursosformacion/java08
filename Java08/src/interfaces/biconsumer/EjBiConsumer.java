package interfaces.biconsumer;

import java.util.function.BiConsumer;

public class EjBiConsumer {

	public static void main(String[] args) {
		BiConsumer<String, Integer> presenta = (x,l) -> {
			String corta = x.substring(0, l);
			System.out.println(corta.toLowerCase());
		};
		
		presenta.accept("PRUEBAS",2);
		
		//Presentara por consola: pr
	}

}
