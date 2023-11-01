public class Main {
    public static void main(String[] args) {
        String[] test = {""};
        AppService service = new AppService(test);
        try {
            service.execute(test);
        } catch (AppException e) {
            System.out.println(e.getMessage());
        }


    }
}