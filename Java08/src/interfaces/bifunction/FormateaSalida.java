package interfaces.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FormateaSalida {

	public static void main(String[] args) {
		//Defino la funcion
		BiFunction<Integer,Integer, Double> pot = (a1,a2) -> Math.pow(a1,a2);
		
		// definimos la segunda
		Function<Double, String> aString = 
				valor -> "Resultado: " + String.valueOf(valor);
		
		//Obtengo funcion mezclada
		BiFunction<Integer, Integer, String> comple = pot.andThen(aString);
		
		//System.out.println(pot.andThen(aString).apply(4, 2));
		System.out.println(comple.apply(4, 2));
				//----> Resultado: 16.0
	}

}
