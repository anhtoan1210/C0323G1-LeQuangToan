package ss1.bai_tap;

import java.util.Scanner;

public class Tien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền cần đổi");
        int tienViet = 23000;
        int doLa;
        doLa = Integer.parseInt(scanner.nextLine());
        int quyDoi = doLa * tienViet;

        System.out.println("số tiền sau khi quy đỏi là"+quyDoi);
    }
}
