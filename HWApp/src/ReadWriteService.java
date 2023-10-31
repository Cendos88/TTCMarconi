import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReadWriteService {
    public static List<Integer> readFromStdIn() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return InputService.chooseNumbers(input);
    }

    public static List<Integer> readFromFile(String filePath) throws IOException {
        String input = Files.readString(Paths.get(filePath));

        return InputService.chooseNumbers(input);
    }

    public static void writeToStdOut(List<Integer> numbers) {
        System.out.println(numbers);
    }

    public static void writeToFile(List<Integer> numbers) throws IOException {
        Files.writeString(Paths.get("output.txt"), numbers.toString());
    }


}
