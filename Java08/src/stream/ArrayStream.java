package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStream {

	public static void main(String[] args) {

		String[] importes = new String[] { "1.000.000", "2.000.000", "3.000.000", "4.000.000", "5.000.000" };

		Integer[] respuesta = Arrays.stream(importes)
				.map(s -> Integer.parseInt(s.replace(".", "")))
				.toArray(Integer[]::new);
		

		Arrays.stream(respuesta).forEach(System.out::println);

		// String[] presupuesto = request.getParameterValues("PRESUPUESTO");
		int[] presupuesto2 = new int[importes.length];
		for (int i = 0; i < importes.length; i++) {
			presupuesto2[i] = Integer.parseInt(importes[i].replace(".", ""));

		}
	}

}
