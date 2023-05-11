package ss3_mang_va_phuong_thuc.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class TinhTongDuongCheo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int soLuong;
        int doDai;
        System.out.println("nhập số lượng của mảng");
        soLuong = scanner.nextInt();
        System.out.println("nhập độ dài của mảng");
        doDai = scanner.nextInt();
        int[][] mang = new int[soLuong][soLuong];
        for (int i = 0; i < soLuong; i++) {
            mang[i] = new int[doDai];
            for (int j = 0; j < mang[i].length; j++) {
                System.out.println("nhập phần tử thứ " + j + "và" + i);
                mang[i][j] = scanner.nextInt();
            }
        }
        int tong = 0;
        for (int i = 0; i < mang.length; i++) {
            tong = tong + mang[i][i];
        }
        System.out.println("tổng của đường chéo "+tong);
    }
}

