package interfaces.function.intfunction;

import java.util.function.IntFunction;

public class BasicoAString {

	public static void main(String[] args) {
		
		//implemento la interface
		//indicando que  devolvera string
		IntFunction<String> toS = a -> "El valor solicitado es " + a; 
		
		//pruebo el método recien implementado
		System.out.println(toS.apply(100)); 
								// ===> El valor solicitado es 100

	}
}
