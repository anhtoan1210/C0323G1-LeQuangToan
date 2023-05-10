package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập sô hàng");
        int a = scanner.nextInt();
        System.out.println("nhập số cột");
        int b = scanner.nextInt();
        int[][] maTran = new int[a][b];
        System.out.println("nhập" + maTran.length + "hang và" + maTran[0].length + "cột");
        for (int hang = 0; hang < maTran.length; hang++) {
            for (int cot = 0; cot < maTran[hang].length; cot++) {
                maTran[hang][cot] = scanner.nextInt();
            }
        }
        for (int hang = 0; hang < maTran.length ; hang++) {
            for (int cot = 0; cot < maTran.length ; cot++) {
                System.out.println(maTran[hang][cot]+"");
            }
            System.out.println();
        }
        int lonNhat = maTran[0][0];
        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[i].length; j++) {
                if (maTran[i][j] > lonNhat) {
                    lonNhat = maTran[i][j];
                }
            }
            System.out.println("phần tử lớn nhất"+lonNhat);
        }
    }
}
