import java.util.ArrayList;
import java.util.List;

public class InputService {
    private static List<Integer> validateInput(String input) throws AppException {
        String[] inputArray = input.trim().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String s : inputArray) {
            try {
                numbers.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
               throw new AppException("Wrong input format. Use numbers separated by ' ' ");
            }

        }
        return numbers;
    }

    public static List<Integer> chooseNumbers(String input) throws AppException {
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
