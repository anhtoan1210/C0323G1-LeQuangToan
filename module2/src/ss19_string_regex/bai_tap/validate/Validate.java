package ss19_string_regex.bai_tap.validate;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    public static void main(String[] args) {
        String regexNameClass = "^[CAP]\\d{4}[GHIK]$";
        String nameClass1 = "C0323G";
        String nameClass2 = "C0523g";
        boolean check1 = Pattern.matches(regexNameClass, nameClass1);
        System.out.println(check1);
        boolean check2 = nameClass2.matches(regexNameClass);
        System.out.println(check2);

    }
}