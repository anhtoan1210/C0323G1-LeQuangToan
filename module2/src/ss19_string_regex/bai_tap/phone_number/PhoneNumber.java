package ss19_string_regex.bai_tap.phone_number;

import ss19_string_regex.bai_tap.validate.Validate;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        String regexPhoneNum = "^\\d{2}-0\\d{9}$";
        do {
            System.out.println("nhập số điện thoại theo định dạng sau (xx)-(0xxxxxxxxx):");
            phoneNumber = scanner.nextLine();
        } while (!checkPhoneNumber(phoneNumber, regexPhoneNum));
        System.out.println("đúng gòi");
    }
    public static boolean checkPhoneNumber(String phoneNumber, String regex) {
        return phoneNumber.matches(regex);
    }
}
