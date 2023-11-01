import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class InputServiceTest {

    @Test
    void oddNumbersTest() throws AppException {
        String input = "1 2 3 4 5";
        assertEquals(InputService.chooseNumbers(input).toString(), "[1, 3, 5]");
    }

    @Test
    void evenNumbersTest() throws AppException {
        String input = "1 2 3 4 5 6";
        assertEquals(InputService.chooseNumbers(input).toString(), "[2, 4, 6]");
    }

    @Test
    void moreSpacesOnEndAndStartTest() throws AppException {
        String input = " 1 2 3 4 5 ";
        assertEquals(InputService.chooseNumbers(input).toString(), "[1, 3, 5]");
    }

    @Test
    void invalidInputCharInInputTest() {
        String input = "a 2 3 4 5";
        assertThrows(AppException.class, () -> InputService.chooseNumbers(input));
    }

    @Test
    void NullInputTest() {
        String input = "a 2 3 4 5";
        assertThrows(AppException.class, () -> InputService.chooseNumbers(input));
    }


}