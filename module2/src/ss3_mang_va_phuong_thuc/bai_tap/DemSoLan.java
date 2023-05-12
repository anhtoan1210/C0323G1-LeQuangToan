package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class DemSoLan {
    public static void main(String[] args) {
        String chuoi = "Le Quang Toản";
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập kí tự cần  kiểm tra");
        char kiTu;
        kiTu = scanner.next().charAt(0);
        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kiTu) {
                dem++;
            }
        }
        System.out.println("kí tự" + kiTu + "xuất hiện số lần là" + dem);
    }
}
