package interfaces.predicate;

import java.util.function.Predicate;

public class PredicateEmpiezaAYMas6 {

	public static void main(String[] args) {
		
		Predicate<String> empiezaA = x -> x.startsWith("A");
		Predicate<String> masDe6 = x -> x.length()>6;
		
		System.out.println("Antonio cumple?:" 
				+ empiezaA.and(masDe6).test("Antonio"));
		System.out.println("Jose cumple?:" 
				+ empiezaA.and(masDe6).test("Jose"));

	}

}
