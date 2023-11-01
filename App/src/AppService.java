
import java.util.ArrayList;
import java.util.List;

public class AppService {
    private final Input input;
    private final Output output;

    public AppService(String[] args) throws AppException {
        this.input = ArgsValidator.selectInput(args);
        this.output = ArgsValidator.selectOutput(args);
    }

    public void execute(String[] args) throws AppException {
        List<Integer> numbers = new ArrayList<>();
        if (this.input.equals(Input.STDIN)) {
            numbers = ReadWriteService.readFromStdIn();
        } else {
            numbers = ReadWriteService.readFromFile(args[0]);
        }
        if (this.output.equals(Output.STDOUT)) {
            ReadWriteService.writeToStdOut(numbers);
        } else {
            ReadWriteService.writeToFile(numbers, args[1]);
        }


    }

}
