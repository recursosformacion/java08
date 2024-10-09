package interfaces.function;

import java.util.function.Function;

public class BasicoCompose {

	public static void main(String[] args) {
		
		//implemento la interface
		//indicando que recibira integers y devolvera doubles
		Function<Integer, Double> mitad = a -> a/2.0; 
		
		//le añado una funcion antes de la que tenia
		mitad = mitad.compose(a ->a + 3);
				
		//pruebo el método recien implementado
		System.out.println(mitad.apply(100)); //----> 51.5
	}
}
