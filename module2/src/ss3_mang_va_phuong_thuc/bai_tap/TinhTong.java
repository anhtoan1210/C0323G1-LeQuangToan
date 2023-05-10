package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuong;
        int doLon;
        int viTri;
        System.out.println("nhập số hàng");
        soLuong = scanner.nextInt();
        System.out.println("nhập số cột");
        doLon = scanner.nextInt();
        int[][] mang = new int[soLuong][soLuong];
        for (int i = 0; i < doLon; i++) {
            mang[i] = new int[doLon];
            for (int j = 0; j < mang[i].length; j++) {
                System.out.println("nhập phần tử thứ" + i + "và" + j);
                mang[i][j] = scanner.nextInt();
            }
        }
        System.out.println("nhập  vị trí cần tih tổng");
        viTri = scanner.nextInt();
        int tong = 0;
        for (int i = 0; i < soLuong; i++) {
            if (viTri == i) {
                for (int j = 0; j < mang.length; j++) {
                    tong = tong+ mang[i][j];
                }
            }
        }
        System.out.println("cot" + viTri + "có tổng là:" + tong);
    }
}
