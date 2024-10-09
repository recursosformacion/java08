package interfaces.bipredicate;

import java.util.function.BiPredicate;


public class Java8BiPredicate {

	public static void main(String[] args) {
		
        //implemento la funcion
        BiPredicate<String, String> empieza = (x,y) -> x.startsWith(y);
        
        System.out.println(empieza.test("Manuel","M"));   //true
        System.out.println(empieza.test("Pedro","M"));  //false
	}
}
