package ss19_string_regex;

import java.util.Scanner;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        String regexEmail = "^^[a-zA-Z0-9]\\w{5,31}@[a-z]{1,11}\\.[a-z]{1,11}$";
        do {
            System.out.println("nhập email");
            email = scanner.nextLine();
        } while (!checkEmail(email, regexEmail));
    }

    public static boolean checkEmail(String email, String regex) {
        return email.matches(regex);
    }
}
