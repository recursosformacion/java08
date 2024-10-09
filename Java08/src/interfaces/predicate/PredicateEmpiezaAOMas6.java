package interfaces.predicate;

import java.util.function.Predicate;

public class PredicateEmpiezaAOMas6 {

	public static void main(String[] args) {
		
		Predicate<String> empiezaA = x -> x.startsWith("A");
		Predicate<String> masDe6 = x -> x.length()>6;
		
		System.out.println("Antonio cumple?:" 
				+ empiezaA.or(masDe6).test("Antonio"));
		System.out.println("Jose cumple?:" 
				+ empiezaA.or(masDe6).test("Jose"));
		System.out.println("Eusebio cumple?:" 
				+ empiezaA.or(masDe6).test("Eusebio"));
	}
}
