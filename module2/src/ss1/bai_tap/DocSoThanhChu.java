package ss1.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập vào số bạn muốn chuyển thành chữ");
        number = scanner.nextInt();
        if (number > 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("số không");
                    break;
                case 1:
                    System.out.println("Một");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bốn");
                    break;
                case 5:
                    System.out.println("năm");
                    break;
                case 6:
                    System.out.println("sáu");
                    break;
                case 7:
                    System.out.println("bảy");
                    break;
                case 8:
                    System.out.println("tám");
                    break;
                case 9:
                    System.out.println("chín");
                    break;
            }
        } else if (number > 10 && number < 20) {
            switch (number) {
                case 10:
                    System.out.println("mười một");
                    break;
                case 12:
                    System.out.println("mười hai");
                    break;
                case 13:
                    System.out.println("mười ba");
                    break;
                case 14:
                    System.out.println("mười bốn");
                    break;
                case 15:
                    System.out.println("mười năm");
                    break;
                case 16:
                    System.out.println("mười sáu");
                    break;
                case 17:
                    System.out.println("mười bảy");
                    break;
                case 18:
                    System.out.println("mười tám");
                    break;
                case 19:
                    System.out.println("mười chín");
                    break;
            }
        } else if (number >= 20 && number < 100) {

            switch (number % 10) {
                case 2:
                    System.out.println("hai mươi");
                    break;
                case 3:
                    System.out.println("ba mươi");
                    ;
                    break;
                case 4:
                    System.out.println("bốn mươi");
                    break;
                case 5:
                    System.out.println("năm muoươi");
                    break;
                case 6:
                    System.out.println("sáu mươi");
                    break;
                case 7:
                    System.out.println("bảy mươi");
                case 8:
                    System.out.println("tám mươi");
                case 9:
                    System.out.println("chín mươi");
            }
        }
    }
}

