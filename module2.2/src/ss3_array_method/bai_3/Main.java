package ss3_array_method.bai_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng của mảng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập so cột của mảng");
        int column  = scanner.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("nhập phàn tử thứ " + i + "" + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        average(arr);

    }

    public static void average(int[][] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sum += arr[i][j];
                    count++;
                }
            }
        }
        System.err.println("Trung bình cộng của phép tính là " + sum / count);
    }
}
