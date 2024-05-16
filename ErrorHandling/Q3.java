class CustomNullPointerException extends NullPointerException {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class Q3 {
    public static void main(String[] args) {
        try {
            String s = null;
            if (s == null) {
                throw new CustomNullPointerException("String is null");
            }
        } catch (CustomNullPointerException e) {
            System.out.println(e);
        }
    }
}
