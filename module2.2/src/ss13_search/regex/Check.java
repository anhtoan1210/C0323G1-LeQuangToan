package ss13_search.regex;

public class Check {
    public static boolean checkId(String id) {
        return id.matches("^SI-\\d{2}$");
    }
}
