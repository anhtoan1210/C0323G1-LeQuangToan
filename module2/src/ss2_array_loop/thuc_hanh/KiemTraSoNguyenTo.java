package ss2_array_loop.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào 1 số");
        int so = Integer.parseInt(scanner.nextLine());
        if (so < 2) {
            System.out.println(so + "không phải là số nguyên tố");
        } else {
            int i = 2;
            boolean kiemTra = true;
            while (i <= Math.sqrt(so)) {
                if (so % i == 0) {
                    kiemTra = false;
                    break;
                }
                i++;
            }
            if(kiemTra){
                System.out.println(so+"là số nguyên tố");
            }else {
                System.out.println(so+"không phải là số nguyên tố");
            }
        }
    }
}
