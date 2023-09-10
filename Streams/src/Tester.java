import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) {
        String fileName = "src/file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            Stream<String> lines = reader.lines();

            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
