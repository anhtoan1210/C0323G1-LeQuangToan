package ss2_array_loop.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        boolean kiemTra;
        int dem = 0;
        for (int i = 2; i > 0; i++) {
            kiemTra = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kiemTra = false;
                }

            }
            if (dem == 20) {
                break;
            }
            if (kiemTra) {
                System.out.println(i);
                dem++;
            }
        }
    }

}



