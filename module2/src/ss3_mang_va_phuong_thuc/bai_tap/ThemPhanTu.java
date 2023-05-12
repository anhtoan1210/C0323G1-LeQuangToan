package ss3_mang_va_phuong_thuc.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int viTri = 0;
        for (int i = 0; i < mang.length; i++) {
            if (viTri <= -1 || viTri >= mang.length - 1) {
                System.out.println("Không chen được");
            }
        }
        int temp;
        for (int i = mang.length-1; i>viTri; i--) {
           mang[i]=mang[i-1];
        }
        mang[viTri]=x;
        System.out.println(Arrays.toString(mang));
    }
}