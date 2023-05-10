package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] mang1 = {1, 2, 3, 4};
        int[] mang2 = {5, 6, 7, 8};
        int[] mang3 = new int[mang1.length + mang2.length];
        for (int i = 0; i < mang1.length; i++) {
            mang3[i] = mang1[i];
        }
        for (int i = 0; i < mang2.length; i++) {
            mang3[mang1.length+i] = mang2[i];
        }
        System.out.println(Arrays.toString(mang3));
    }
}
