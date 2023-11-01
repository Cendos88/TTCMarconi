import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArgsValidatorTest {

    @Test
    void selectInputEmptyArgsTest() {
        String[] args = {};
        assertThrows(AppException.class, () -> ArgsValidator.selectInput(args));
    }

    @Test
    void selectInputStdInTest() throws AppException {
        String[] args = {"1"};
        assertEquals(Input.STDIN, ArgsValidator.selectInput(args));
    }

    @Test
    void selectInputFileInTest() throws AppException {
        String[] args = {"input.txt"};
        assertEquals(Input.FILE, ArgsValidator.selectInput(args));
    }

    @Test
    void selectInputNegativeNumberArg() throws AppException {
        String[] args = {"-1"};
        assertEquals(Input.FILE, ArgsValidator.selectInput(args));
    }

    @Test
    void selectInputCharInNumbersArg() throws AppException {
        String[] args = {"-1po"};
        assertEquals(Input.FILE, ArgsValidator.selectInput(args));
    }
    @Test
    void selectInputLongNumberArg() throws AppException {
        String [] args = {"12546789"};
        assertEquals(Input.STDIN, ArgsValidator.selectInput(args));
    }


    @Test
    void selectOutputNoArg() {
        String[] args = {"1"};
        assertEquals(Output.STDOUT, ArgsValidator.selectOutput(args));
    }
    @Test
    void selectOutputTwoArgs() {
        String[] args = {"1","output.txt"};
        assertEquals(Output.FILE, ArgsValidator.selectOutput(args));
    }
    @Test
    void selectOutputManyArgs() {
        String[] args = {"1","output.txt","output2.txt","output3.txt"};
        assertEquals(Output.FILE, ArgsValidator.selectOutput(args));
    }

}