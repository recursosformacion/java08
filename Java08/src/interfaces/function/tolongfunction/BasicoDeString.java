package interfaces.function.tolongfunction;


import java.util.function.ToLongFunction;

public class BasicoDeString {

	public static void main(String[] args) {
		
		//implemento la interface
		//indicando que Entregare string
		ToLongFunction<String> i  = (x)-> Long.parseLong(x);
		
		//pruebo el método recien implementado
		System.out.println(i.applyAsLong("2"));
				// ===> 2

	}
}
