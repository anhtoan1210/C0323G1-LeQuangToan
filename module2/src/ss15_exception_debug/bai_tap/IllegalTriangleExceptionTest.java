package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num1 = 0;
            do {
                try {
                    System.out.println("nhap vào cạnh A của tam giác ");
                    num1 = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("vui lòng nhập số");
                }
            } while (true);
            int num2 = 0;
            do {
                try {

                    System.out.println("nhập vào cạnh B của tam giác");
                    num2 = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("vui lòng nhập số");
                }
            } while (true);
            int num3 = 0;
            do {
                try {
                    System.out.println("nhập vào cạnh c");
                    num3 = scanner.nextInt();
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("vui lòng nhập số");
                }
            } while (true);


            try {
                checkNum(num1, num2, num3);
                checkTriangle(num1, num2, num3);
                break;
            } catch (IllegalTriangleException e) {
                System.err.println("Nhap sai rồi bạn ơi");
                System.out.println("vui lòng nhập lại");
            }
        }
    }

    public static boolean checkNum(int num1, int num2, int num3) throws IllegalTriangleException {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            throw new IllegalTriangleException("không phải là cạnh của tam giác!vui lòng nhập lại");
        }
        return true;
    }

    public static boolean checkTriangle(int num1, int num2, int num3) throws IllegalTriangleException {
        if (num1 >= num2 + num3 || num2 >= num1 + num3 || num3 >= num1 + num2) {
            throw new IllegalTriangleException("không phải là tam giác");
        }
        return true;
    }
}
