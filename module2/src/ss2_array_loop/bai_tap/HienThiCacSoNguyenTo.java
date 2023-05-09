package ss2_array_loop.bai_tap;

public class HienThiCacSoNguyenTo {
    public static void main(String[] args) {
        boolean kiemTra;
        for (int i = 2; i < 100; i++) {
            kiemTra = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kiemTra = false;
                }
            }
            if (kiemTra) {
                System.out.println(i);
            }
        }

    }
}
