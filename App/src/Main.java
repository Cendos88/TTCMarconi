public class Main {
    public static void main(String[] args) {
        try {
            AppService service = new AppService(args);
            service.execute(args);
        } catch (AppException e) {
            System.out.println(e.getMessage());
        }
    }
}