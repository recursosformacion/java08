package interfaces.bifunction;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class CalculadoraBifunction {

	// Guardo las operaciones --------------------------------
	static BiFunction<Double, Double, Double> mas = (x, y) -> x + y;
	static BiFunction<Double, Double, Double> menos = (x, y) -> x - y;
	static BiFunction<Double, Double, Double> por = (x, y) -> x * y;
	static BiFunction<Double, Double, Double> div = (x, y) -> x / y;
	
	// Preparo la segunda operacion
	static Function<Double, String> lista = dato -> "Resultado: " + String.valueOf(dato);
			

	public static void main(String[] args) {
		
		calcula(); // iniciamos ejecucion
	}

	public static void calcula() {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		boolean ok = true;
		String oper = "";

		while (ok) {
			double valor = 0;
			do {
				try {
					System.out.println("Indica un numero");
					String valorS = sc.nextLine();
					valor = Double.valueOf(valorS);
				} catch (Exception e) {
					valor = Double.MAX_VALUE;
				}
			} while (valor == Double.MAX_VALUE);
			if (valor > 0) {
				System.out.println("Operacion (+, -, *, /)");
				oper = sc.nextLine();
			}
			switch (oper.charAt(0)) {
			case '+':
				total = mas.apply(total, valor);
				break;
			case '-':
				total = menos.apply(total, valor);
				break;
			case '*':
				total = por.apply(total, valor);
				break;
			case '/':
				total = div.apply(total, valor);
				break;
			default:
				System.out.println("Operacion <" + oper.charAt(0) + "> no encontrada");
			}
			System.out.println(lista.apply(total));

		}

	}
}
