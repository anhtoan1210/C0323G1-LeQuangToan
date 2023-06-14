package ss2_loop.bai_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số thứ 1");
        double numberOne = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập số thứ 2");
        double numberTwo = Double.parseDouble(scanner.nextLine());
        int max = 0;
        for (int i = 1; i <= numberOne; i++) {
            for (int j = 1; j <= numberTwo; j++) {
                if (numberOne % i == 0 && numberTwo % i == 0) {
                    max = i;
                    break;
                }
            }

        }
        int min = 0;
        for (int i = 1; i <= numberOne * numberTwo; ) {
            if (i % numberOne == 0 && i % numberTwo == 0) {
                min = i;
                break;
            } else {
                i++;
            }
        }
        System.out.println("ước chưng lớn nhất là " + max);
        System.out.println("bội chưng nhỏ nhất là " + min);
        double average = (max + min) / 2;
        System.out.println("Trung bình cộng " + average);

    }
}

