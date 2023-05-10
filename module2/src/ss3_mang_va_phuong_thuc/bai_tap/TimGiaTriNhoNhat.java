package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        System.out.println("nhap do dai cua mang");
        Scanner scanner = new Scanner(System.in);
        int doLon;
        doLon = scanner.nextInt();
        int[] mang;
        mang = new int[doLon];
        for (int i = 0; i < doLon; i++) {
            System.out.println("nhập phần tử thứ " + i);
            mang[i] = scanner.nextInt();
        }
        System.out.println("giá trị nhỏ nhất");
        int nhoNhat = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] < mang[0]) {
                nhoNhat = mang[i];
            }
        }
        System.out.println(nhoNhat);
    }
}
