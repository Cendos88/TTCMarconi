public class ArgsValidator {
    public static Input selectInput(String[] args) throws AppException {
        if(args.length==0){
            throw new AppException("At least one argument is required");
        }
        Input input = Input.FILE;
        if (args[0].matches("[0-9]+")) {
            input = Input.STDIN;
            return input;
        }
        return input;
    }

    public static Output selectOutput(String[] args) {
        Output output = Output.FILE;
        if (args.length == 1) {
            output = Output.STDOUT;
            return output;
        }
        return output;
    }
}
