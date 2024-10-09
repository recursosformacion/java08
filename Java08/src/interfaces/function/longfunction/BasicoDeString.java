package interfaces.function.longfunction;


import java.util.function.LongFunction;

public class BasicoDeString {

	public static void main(String[] args) {
		
		//implemento la interface
		//indicando que devolvera String
		LongFunction<String> i  = (x)-> "El valor es " + x;
		
		//pruebo el método recien implementado
		System.out.println(i.apply(124578963L));
				// ===> El valor es 124578963

	}
}
