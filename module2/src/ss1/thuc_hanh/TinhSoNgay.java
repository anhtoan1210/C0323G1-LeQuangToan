package ss1.thuc_hanh;

import java.util.Scanner;

public class TinhSoNgay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("which month that you want to count days");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.printf("The month '2' has 28 or 29 days!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("the month" + month + "has 31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("The month" + month + "has 30 day");
                break;
            default:
                System.out.printf("Invalit input!");
                break;
        }
    }
}
