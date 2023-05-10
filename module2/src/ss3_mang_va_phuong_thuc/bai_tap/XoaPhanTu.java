package ss3_mang_va_phuong_thuc.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int viTri = 0;
        for (int i = 0; i < mang.length; i++) {
            if (x == mang[i]) {
                viTri = i;

            }
        }
        for (int i = viTri; i < mang.length - 1; i++) {
            mang[i] = mang[i + 1];
        }
        mang[mang.length - 1] = 0;
        System.out.println(Arrays.toString(mang));
    }
}
