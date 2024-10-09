package interfaces.function.tointfunction;

import java.util.function.ToIntFunction;

public class BasicoAString {

	public static void main(String[] args) {
		
		//implemento la interface
		//indicando que recibira String
		ToIntFunction<String> toS = 
				a -> Integer.parseInt(a);
		
		//pruebo el método recien implementado
		System.out.println(toS.applyAsInt("23")); 
				// ===> El valor solicitado es 23

	}
}
