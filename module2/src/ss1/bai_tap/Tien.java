package ss1.bai_tap;

import java.util.Scanner;

public class Tien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền cần đổi");
        int tyLe = 23000;
        int doLa;
        doLa = Integer.parseInt(scanner.nextLine());
        int tienViet = doLa * tyLe;

        System.out.println("số tiền sau khi quy đỏi là"+tienViet);
    }
}

