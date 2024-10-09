package interfaces.function.tolongfunction;

import java.util.function.ToLongFunction;

public class Basico {

	public static void main(String[] args) {
		
		//implemento la interface
		//indicando que recibira int 
		ToLongFunction<Integer> multi = a -> a * 12345678; 
		
		//pruebo el método recien implementado
		System.out.println(multi.applyAsLong(100)); // ===> 1234567800

	}
}
