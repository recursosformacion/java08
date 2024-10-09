package stream.constructores.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DesdeFiles {

	public static void main(String[] args) throws IOException {
		String dir = ".";
		Files.list(Paths.get(dir)).forEach(System.out::println);
		
		Files.walk(Paths.get(dir),2).forEach(System.out::println);
	}
}
