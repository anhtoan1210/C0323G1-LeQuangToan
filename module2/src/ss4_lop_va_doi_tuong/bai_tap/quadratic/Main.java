package ss4_lop_va_doi_tuong.bai_tap.quadratic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        double a = scanner.nextDouble();
        System.out.println("nhập b");
        double b = scanner.nextDouble();
        System.out.println("nhập c");
        double c = scanner.nextDouble();
        Quadratic quadratic = new Quadratic(a, b, c);
        if (quadratic.getDiscriminant() > 0) {
            System.out.println("phuong trình có 2 nghiêm" + quadratic.getRoot1() + "và" + quadratic.getRoot2());
        } else if (quadratic.getDiscriminant() == 0) {
            System.out.println("phương trinhd có 1 nghiệm" + quadratic.getRoot1());
        }else {
            System.out.println("phuong trình vô nghiệm");
        }
    }
}