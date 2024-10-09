package optional;

import java.util.Optional;

public class PrOptional {

	public static void main(String[] args) {
		stringToInteger("1234").ifPresent(System.out::println);
		stringToInteger("Registro 5678").ifPresent(System.out::println);
		stringToInteger(null).ifPresent(System.out::println);
		stringToInteger("Hola").ifPresent(System.out::println);
	}

	static Optional<Integer> stringToInteger(String s) {
		try {
			return Optional.of(Integer.parseInt(s));
		} catch (NumberFormatException e) {
			return Optional.empty();
		}
	}

}
