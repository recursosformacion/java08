package ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CuadradoMagico {

	static int numero=3;	//numero de filas y columnas
	
	public static void main(String[] args) {
		//Determinar numero mágico
		int nmag = numero * ((numero*numero) + 1) /2;
		List<Integer> arreglo = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> ordenado = arreglo.stream().sorted().collect(Collectors.toList());
	}
}
