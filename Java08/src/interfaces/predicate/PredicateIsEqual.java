package interfaces.predicate;

import java.util.function.Predicate;

public class PredicateIsEqual {

	public static void main(String[] args) {
		Predicate<String> n10 = Predicate.isEqual("Casa");
		
		System.out.println("Es Casa - :" + n10.test("Casa"));
		System.out.println("Es Piso - :" + n10.test("Piso"));
	}

}
