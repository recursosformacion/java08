package interfaces.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicatePar {

	public static void main(String[] args) {
		//Implemento la interfaz - - - -
		BiPredicate<String, Integer> longitud = (x,y) -> {
            return x.length() >= y;			//establezco la funcion
        };
     
        boolean result = longitud.test("Miguel",7);
        System.out.println(result);  // False
        boolean result1 = longitud.test("Alejandro",7);
        System.out.println(result1);  // True

	}
}
