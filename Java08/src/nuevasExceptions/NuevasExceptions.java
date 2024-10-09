package nuevasExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class NuevasExceptions {

	public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("usage: " + NuevasExceptions.class.getSimpleName() + " <filename>");
            return;
        }

        BufferedReader br = Files.newBufferedReader(Paths.get(args[0]), StandardCharsets.UTF_8);
        try {
            br.lines()
                    .onClose(
                            () -> {
                                try {
                                    br.close();
                                } catch (IOException e) {
                                    throw new UncheckedIOException(e);
                                }
                            })
                    .forEach(System.out::println);
        } catch (Error | RuntimeException e) { // handle UncheckedIOException
            try {
                br.close();
            } catch (IOException ex) {
                try {
                    e.addSuppressed(ex);
                } catch (Throwable ignored) {
                }
            }
            throw e;
        }
    }
}
