public class AppException extends Throwable {
    @Override
    public String getMessage() {
        return message;
    }

    private final String message;

    public AppException(String message) {
        this.message = message;
    }
}
