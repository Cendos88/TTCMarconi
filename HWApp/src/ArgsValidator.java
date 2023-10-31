public class ArgsValidator {
    public static String selectInput(String[] args) {
        String input = "File";
        if (args[0].matches("[0-9]+")) {
            input = "StdIn";
            return input;
        }
        return input;
    }

    public static String selectOutput(String[] args) {
        String output = "File";
        if (args.length == 1) {
            output = "StdOut";
            return output;
        }
        return output;
    }
}
