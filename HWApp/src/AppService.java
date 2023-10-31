import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class AppService {
    public static List<Integer> readFromInput(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        return null;
    }
    public static List<Integer> readFromFile(String filePath) throws IOException {
        Files.readString(Paths.get(filePath));
        System.out.println(Files.readString(Paths.get(filePath)));
        return null;
    }
    public static void writeToOutput(List<Integer> numbers){
        System.out.println(numbers);
    }
    public static  void writeToFile(List<Integer> numbers){

    }

}
