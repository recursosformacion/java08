package interfaces.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateNegate {

	public static void main(String[] args) {

		// Implemento la interfaz - - - -
		BiPredicate<String, Integer> longitud = (x, y) -> {
			return x.length() >= y; // establezco la funcion
		};

		System.out.println(
				"Antonio mide 7 o mas?:" + longitud.test("Antonio",7));
		System.out.println(
				"Antonio NO mide 7 o mas?:" + longitud.negate().test("Antonio",7));
	}
}
