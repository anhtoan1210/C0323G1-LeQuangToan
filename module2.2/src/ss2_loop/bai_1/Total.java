package ss2_loop.bai_1;

import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào 1 số");
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
//                System.out.println(i);
                sum = sum + i;
            }

        }
        System.out.println(sum);
    }

}
