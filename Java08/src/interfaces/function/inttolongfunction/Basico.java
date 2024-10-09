package interfaces.function.inttolongfunction;

import java.util.function.IntToDoubleFunction;

public class Basico {

	public static void main(String[] args) {
		
		//implemento la interface
		//recibe int, ha de responder double
		IntToDoubleFunction mitad = a -> a / 2; 
		
		//pruebo el método recien implementado
		double num = mitad.applyAsDouble(100);
		System.out.println(num); // ===> 50.0

	}
}
