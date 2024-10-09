package interfaces.function.longtointfunction;

import java.util.function.LongToIntFunction;

public class Basico {

	public static void main(String[] args) {
		
		//implemento la interface
		//recibe long, ha de responder int
		LongToIntFunction mitad = a -> (int)(a / 2); 
		
		//pruebo el método recien implementado
		int num = mitad.applyAsInt(987654321L);
		System.out.println(num); // ===> 493827160

	}
}
