package ss3_array_method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8};
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                System.out.println(i);
            } else {
                System.out.println("Không tồn tại");
            }
        }
    }
}
