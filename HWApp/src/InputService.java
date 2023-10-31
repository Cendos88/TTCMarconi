import java.util.ArrayList;
import java.util.List;

public class InputService {
    private static List<Integer> validateInput(String input) {
        String[] inputArray = input.trim().split(";");
        List<Integer> numbers = new ArrayList<>();
        for (String s : inputArray) {
            try {
                numbers.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                System.out.println("Wrong input format. Use ; as a separator");
            }

        }
        return numbers;
    }

    public static List<Integer> chooseNumbers(String input) {
        List<Integer> original = validateInput(input);
        if (original.size() % 2 == 0) {
            return evenLength(original);
        }
        return oddLength(original);

    }

    private static List<Integer> oddLength(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer i : numbers) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }
        return oddNumbers;
    }

    private static List<Integer> evenLength(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }

}
