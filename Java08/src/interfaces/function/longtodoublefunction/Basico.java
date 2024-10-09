package interfaces.function.longtodoublefunction;

import java.util.function.IntToLongFunction;

public class Basico {

	public static void main(String[] args) {
		
		//implemento la interface
		//recibe int, ha de responder long
		IntToLongFunction mitad = a -> (long)(a / 2); 
		
		//pruebo el método recien implementado
		long num = mitad.applyAsLong(100);
		System.out.println(num); // ===> 50

	}
}
