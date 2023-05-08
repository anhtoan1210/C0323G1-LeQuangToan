package ss1.thuc_hanh;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.printf("Linear Equation Resolver");
        System.out.printf("Given a epuation as 'a*x+b=c',please enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("a;");
        double a = scanner.nextDouble();
        System.out.printf("b:");
        double b = scanner.nextDouble();
        System.out.printf("c:");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("" + answer);
        } else {
            if (b == c) {
                System.out.printf("The solution is all x!");
            } else {
                System.out.printf("No solution");
            }
        }
    }
}
