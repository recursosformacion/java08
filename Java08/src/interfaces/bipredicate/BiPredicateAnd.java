package interfaces.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateAnd {

	public static void main(String[] args) {
		
		//implemento la funcion
        BiPredicate<String, Integer> mq = (x,y) -> x.length()>=y;
        BiPredicate<String, Integer> nq = (x,y) -> x.length()<y+2;
		
        //mq + nq
		System.out.println("Antonio cumple?:" 
				+ mq.and(nq).test("Antonio",7));
		System.out.println("Jose cumple?:" 
				+ mq.and(nq).test("Jose",7));
		System.out.println("Alejandro cumple?:" 
				+ mq.and(nq).test("Alejandro",7));
	}
}
