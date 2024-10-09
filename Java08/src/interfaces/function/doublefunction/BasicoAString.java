package interfaces.function.doublefunction;

import java.util.function.DoubleFunction;

public class BasicoAString {

	public static void main(String[] args) {
		
		//implemento la interface
		//indicando que devolvera String
		DoubleFunction<String> toS = 
				a -> "El valor solicitado es " + Double.toString(a); 
		
		//pruebo el método recien implementado
		System.out.println(toS.apply(Double.MAX_VALUE)); 
				// ===> El valor solicitado es 1.7976931348623157E308

	}
}
