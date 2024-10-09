package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxMinProd {

	public static void main(String[] args) {
		Random random = new Random();
//		List<Integer> entrada = random.ints(5,1,1000)
//			    .boxed()
//			    .collect(Collectors.toList());
		List<Integer> entrada = new ArrayList<Integer>(Arrays.asList(1,3,5,7,9));
		
		long max = entrada
				.stream()
				.mapToLong(x->x)				
				.max().orElseThrow(NoSuchElementException::new);
		long min = entrada
				.stream()
				.mapToLong(x->x)
				.min().orElseThrow(NoSuchElementException::new);
		double prom = entrada
				.stream()
				.mapToLong(x->x)
				.average().orElse(0);
		
		entrada.forEach(System.out::println);
		System.out.println("Maximo...:" + max);
		System.out.println("Minimo...:" + min);
		System.out.println("Promedio.:" + prom);
	}
	
	


}
