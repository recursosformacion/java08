package interfaces.function;

import java.util.function.Function;

public class BasicoIdentity {

	public static void main(String[] args) {
		
		//implemento la interface con la funcion identity
		Function<Integer, Integer> i = Function.identity();
		 
        // pruebo su funcionamiento
        System.out.println(i.apply(10)); //---> 10
	}

}
