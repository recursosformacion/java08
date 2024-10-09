package interfaces.predicate;

import java.util.function.Predicate;

public class PredicateEmpieza {

	public static void main(String[] args) {
		
		Predicate<String> empiezaA = x -> x.startsWith("A");
		Predicate<String> noEmpiezaA = empiezaA.negate();
		System.out.println("Antonio no empieza por A?:" 
						   + noEmpiezaA.test("Antonio"));
		System.out.println("Jose no empieza por A?:" 
						   + noEmpiezaA.test("Jose"));
	}
}
