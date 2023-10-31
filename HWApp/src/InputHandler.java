import java.util.ArrayList;
import java.util.List;

public class InputHandler {
    public static List<Integer> listFromInput(String input){
        String[] inputArray = input.trim().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String s : inputArray) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }

}
