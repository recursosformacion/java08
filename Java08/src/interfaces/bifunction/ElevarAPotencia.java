package interfaces.bifunction;

import java.util.function.BiFunction;

public class ElevarAPotencia {

	public static void main(String[] args) {
		//Defino la funcion
		BiFunction<Integer,Integer, Double> pot = 
				(a1,a2) -> Math.pow(a1,a2);
		
		System.out.println(pot.apply(4, 2)); // --->16.0
	}

}
