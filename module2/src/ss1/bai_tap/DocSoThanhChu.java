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
        } else if (number >= 20 && number < 100) {
            String string1 = "";
            String string2 = "";
            switch (number / 10) {
                case 2:
                    string1 = "hai mươi";
                    break;
                case 3:
                    string1 = "ba mươi";
                    break;
                case 4:
                    string1 = "bốn mươi";
                    break;
                case 5:
                    string1 = "năm mươi";
                    break;
                case 6:
                    string1 = "sáu mươi";
                    break;
                case 7:
                    string1 = "bảy mươi";
                    break;
                case 8:
                    string1 = "tám mươi";
                    break;
                case 9:
                    string1 = "chín mươi";
                    break;
            }
            switch (number % 10) {
                case 1:
                    string2 = "một";
                    break;
                case 2:
                    string2 = "hai";
                    break;
                case 3:
                    string2 = "ba";
                    break;
                case 4:
                    string2 = "bốn";
                    break;
                case 5:
                    string2 = "nam";
                    break;
                case 6:
                    string2 = "sáu";
                    break;
                case 7:
                    string2 = "bảy";
                    break;
                case 8:
                    string2 = "tám";
                    break;
                case 9:
                    string2 = "chín";
                    break;
            }
            System.out.println(string1 + "-" + string2);
        } else if (number >= 100 && number < 1000) {
            String string3 = "";
            String string4 = "";
            String string5 = "";
            switch (number / 100) {
                case 1:
                    string3 = "một trăm";
                    break;
                case 2:
                    string3 = "hai trăm";
                    break;
                case 3:
                    string3 = "ba trăm";
                    break;
                case 4:
                    string3 = "bốn trăm";
                    break;
                case 5:
                    string3 = "năm trăm";
                    break;
                case 6:
                    string3 = "sáu trăm";
                    break;
                case 7:
                    string3 = "bảy trăm";
                    break;
                case 8:
                    string3 = "tám trăm";
                    break;
                case 9:
                    string3 = "chín trăm";
                    break;
            }
            switch ((number % 100) / 10) {
                case 1:
                    switch (number % 100) {
                        case 10:
                            string4 = "mươi";
                            break;
                        case 11:
                            string4 = "mười một";
                            break;
                        case 12:
                            string4 = "mười hai";
                            break;
                        case 13:
                            string4 = "mười ba";
                            break;
                        case 14:
                            string4 = "mười bốn";
                            break;
                        case 15:
                            string4 = "mười lăm";
                            break;
                        case 16:
                            string4 = "mười sáu";
                            break;
                        case 17:
                            string4 = "mươi bảy";
                            break;
                        case 18:
                            string4 = "mười tám";
                            break;
                        case 19:
                            string4 = "mười chín";
                            break;
                    }
                    break;
                case 2:
                    string4 = "hai mươi";
                    break;
                case 3:
                    string4 = "ba mươi";
                    break;
                case 4:
                    string4 = "bốn mươi";
                    break;
                case 5:
                    string4 = "năm mươi";
                    break;
                case 6:
                    string4 = "sáu mươi";
                    break;
                case 7:
                    string4 = "bảy mươi";
                    break;
                case 8:
                    string4 = "tám mươi";
                    break;
                case 9:
                    string4 = "chisn mươi";
                    break;
            }
            switch ((number % 100) % 10) {
                case 1:
                    string5 = "một";
                    break;
                case 2:
                    string5 = "hai";
                    break;
                case 3:
                    string5 = "ba";
                    break;
                case 4:
                    string5 = "bốn";
                    break;
                case 5:
                    string5 = "năm";
                    break;
                case 6:
                    string5 = "sau";
                    break;
                case 7:
                    string5 = "bảy";
                    break;
                case 8:
                    string5 = "tám";
                    break;
                case 9:
                    string5 = "chín";
                    break;
            }
            if ((number % 100) < 20 && (number % 100) >= 10) {
                System.out.println(string3 + "-" + string4);
            } else {
                System.out.println(string3 + "-" + string4 + " " + string5);
            }
        } else {
            System.out.println("không");
        }
    }
}



