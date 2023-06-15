package ss3_array_method.bai_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        int medium = 0;
        System.out.println("nhập vào số lượng của mảng");
        n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        System.out.println("nhập các phaanf tử cho mảng");
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ" + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum = sum + arr[i];
                integerList.add(arr[i]);
            }
        }
        System.out.println("Tổng " + sum);
        for (int i = 0; i < integerList.size(); i++) {
            medium = sum / integerList.size();
        }
        System.out.println("Trung bình cộng " + medium);
    }
}
