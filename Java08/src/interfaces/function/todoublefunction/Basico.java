package interfaces.function.todoublefunction;

import java.util.function.ToDoubleFunction;

public class Basico {

	public static void main(String[] args) {
		
		//implemento la interface
		//indicando que recibira Long
		ToDoubleFunction<Long> mitad = a -> a / 2; 
		
		//pruebo el método recien implementado
		double num = mitad.applyAsDouble(12345678901234L);
		System.out.println(num); // ===> 6.172839450617E12

	}
}
