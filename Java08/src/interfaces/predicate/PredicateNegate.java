package interfaces.predicate;

import java.util.function.Predicate;

public class PredicateNegate {

	public static void main(String[] args) {
		
		Predicate<String> empiezaA = x -> x.startsWith("A");
		
		System.out.println("Antonio empieza por A?:" + empiezaA.test("Antonio"));
		System.out.println("Jose empieza por A?:" + empiezaA.test("Jose"));

	}

}
