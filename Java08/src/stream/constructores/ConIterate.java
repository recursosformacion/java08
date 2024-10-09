package stream.constructores;

import java.util.stream.Stream;

public class ConIterate {

	public static void main(String[] args) {
		
		Stream.iterate(0, n -> n + 1)
        .limit(10)
        .forEach(x -> System.out.println(x));
		
		Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
		.limit(20)
		.map(n -> n[0])
		.forEach(x -> System.out.println(x));

	}

}
