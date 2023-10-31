import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String [] test = {"1", "HWApp/output.txt"};
        AppService service = new AppService(test);
        try {
            service.execute(test);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}