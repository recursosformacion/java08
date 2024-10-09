package stream.constructores;


import java.util.stream.Stream;

public class ConBuild {

	public static void main(String[] args) {
		
		Stream.Builder<String> builder = Stream.builder();
		
		Stream<String> colores = builder.add("Blanco")
                .add("Azul")
                .add("Amarillo")
                .add("Verde")
                .add("Rojo")
                .build();
		
		colores.forEach(System.out::println);

	}

}
