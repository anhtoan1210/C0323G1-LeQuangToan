package ss11_stack_queue;

import java.util.Scanner;

public class checkPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println();
    }

    public checkPrimes(int n) {
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (n % i != 0) {
                flag = true;
            }
        }


    }

}

