import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReadWriteService {
    public static List<Integer> readFromStdIn() throws AppException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return InputService.chooseNumbers(input);
    }

    public static List<Integer> readFromFile(String filePath) throws AppException {
        String input;
        try {
            input = Files.readString(Paths.get(filePath));
        } catch (IOException e) {
            throw new AppException("File not found");
        }

        return InputService.chooseNumbers(input);
    }

    public static void writeToStdOut(List<Integer> numbers) {
        System.out.println(numbers);
    }

    public static void writeToFile(List<Integer> numbers, String filePath) throws AppException {
        try {
            Files.writeString(Paths.get(filePath), numbers.toString());
        } catch (IOException e) {
            throw new AppException("Invalid name of new file");
        }
    }


}
