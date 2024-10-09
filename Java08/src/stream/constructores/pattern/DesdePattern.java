package stream.constructores.pattern;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DesdePattern {

	public static void main(String[] args) {
		String REGEX = " ";
		String actualString = "Esto es una prueba de Pattern.splitAsStream";
		Pattern pattern = Pattern.compile(REGEX);

		Stream<String> stream = pattern.splitAsStream(actualString);

		// print array
		stream.forEach(System.out::println);

	}

}
