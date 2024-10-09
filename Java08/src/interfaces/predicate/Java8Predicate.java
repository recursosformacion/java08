package interfaces.predicate;

import java.util.function.Predicate;

public class Java8Predicate {

	public static void main(String[] args) {
		Predicate<String> longitud = (x) -> {
            return x.length() >= 6;			//establezco la funcion
        };
        Predicate<String> empiezaM = (x) -> x.startsWith("M");
        
        boolean result = longitud.test("Miguel");
        System.out.println(result);  // False
        boolean result1 = longitud.test("Alejandro");
        System.out.println(result1);  // True

        
        System.out.println(longitud.or(empiezaM).test("Manuel"));   //true
        System.out.println(longitud.and(empiezaM).test("Manuel"));  //false
        
        longitud = longitud.negate();
      
        System.out.println(longitud.test("Miguel"));  // True
        
        Predicate<String> esPedro = Predicate.isEqual("Pedro");
        System.out.println(esPedro.test("Pedro"));     //true
        
	}

}
