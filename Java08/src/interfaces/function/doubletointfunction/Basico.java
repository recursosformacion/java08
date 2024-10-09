package interfaces.function.doubletointfunction;

import java.util.function.LongToDoubleFunction;

public class Basico {

	public static void main(String[] args) {
		
		//implemento la interface
		//recibe long, ha de responder double
		LongToDoubleFunction mitad = a -> (double)(a / 2); 
		
		//pruebo el método recien implementado
		double num = mitad.applyAsDouble(987654321L);
		System.out.println(num); // ===> 4.9382716E8

	}
}
