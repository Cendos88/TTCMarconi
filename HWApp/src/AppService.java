import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppService {
    private final String input;
    private final String output;

    public AppService(String [] args) {
        this.input = ArgsValidator.selectInput(args);
        this.output = ArgsValidator.selectOutput(args);
    }

    public void execute(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        if(this.input.equals("StdIn")){
            numbers = ReadWriteService.readFromInput();
        }
        else{
             numbers = ReadWriteService.readFromFile(args[0]);
        }
        if(this.output.equals("StdOut")){
            ReadWriteService.writeToOutput(numbers);
        }
        else {
            ReadWriteService.writeToFile(numbers);
        }



    }

}
