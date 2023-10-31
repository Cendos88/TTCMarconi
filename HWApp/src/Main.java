import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] test = {"1","ahoj.txt"};
        AppService service = new AppService(test);
        try {
            service.execute(test);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}