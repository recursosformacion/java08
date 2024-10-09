package interfaces.function.doubletolongfunction;

import java.util.function.DoubleToLongFunction;

public class Basico {

	public static void main(String[] args) {
		
		//implemento la interface
		//recibe double, ha de responder int
		DoubleToLongFunction mitad = a -> (long)a / 2; 
		
		//pruebo el método recien implementado
		long num = mitad.applyAsLong(324.12);
		System.out.println(num); // ===> 162

	}
}
