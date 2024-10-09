package lambdas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LeeYGraba {

	public static void main(String[] args) throws IOException {
		// Creo el archivo temporal
		File filetext = File.createTempFile("sinjava", ".txt");
		// creo una colección de lineas que voy a escribir en él.
		List<String> lineas = Arrays.asList("Welcome", "To java 8", "Bartolomé");
		FileWriter writer = new FileWriter(filetext);
		for (String linea : lineas) {
			writer.append(linea + "\n");
		}
		writer.close();
		// Lectura con java 8
		Stream<String> multilineas = Files.lines(filetext.toPath());
		for (Iterator<String> iterator = multilineas.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		multilineas.close();

		// Expresion lambda
		Stream<String> lambdaStream = Files.lines(filetext.toPath());
		lambdaStream.forEach(s -> System.out.println(s));
		lambdaStream.close();

		// Filtrado con expresión lambda
		Stream<String> lambdaFilter = Files.lines(filetext.toPath());
		Optional<String> tengoCome = lambdaFilter.filter(s -> s.contains("om")).findAny();
		if (tengoCome.isPresent()) {
			System.out.println(tengoCome.get());
		}
		lambdaFilter.close();
	}

}
