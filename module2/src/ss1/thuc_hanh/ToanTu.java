package ss1.thuc_hanh;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.printf(" Nhập chiều rộng");
        width = scanner.nextFloat();
        System.out.printf("Nhập chiều dài");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.printf("Diện tích" + area);
    }
}
