package ss17_io_text_binary.regex;

public class Check {
    public static boolean checkId(String id) {
        return id.matches("^SI-\\d{2}$");
    }
}
