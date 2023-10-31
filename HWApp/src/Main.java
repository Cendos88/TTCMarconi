import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Integer> test = AppService.readFromFile("HWAPP/input.txt");
        } catch (IOException e) {
            System.out.println("File not found");
        }


    }
}