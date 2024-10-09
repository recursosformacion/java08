package interfaces.function.longfunction;

import java.util.function.LongFunction;

public class Basico {

	public static void main(String[] args) {
		
		//implemento la interface
		//indicando que recibira doubles
		LongFunction<Double> mitad = a -> a/2.0; 
		
		//pruebo el método recien implementado
		System.out.println(mitad.apply(100)); // ===> 50.0

	}
}
