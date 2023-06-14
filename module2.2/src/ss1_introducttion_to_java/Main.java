package ss1_introducttion_to_java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        System.out.println("nhập vào số thứ nhất");
        double numberOne = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập vào số thứ 2");
        double numberTwo = Double.parseDouble(scanner.nextLine());
        do {
            System.out.println("___________");
            System.out.println("mời bạn lựa chọn chức năng");
            System.out.println("1.cộng");
            System.out.println("2.Trừ");
            System.out.println("3.Nhân");
            System.out.println("4.Chia");
            System.out.println("5.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    double add = numberOne + numberTwo;
                    System.err.println("tổng của phép tính là " + add);
                    break;
                case 2:
                    double apartFrom = numberOne - numberTwo;
                    System.err.println("kết quả của phép trừ là " + apartFrom);
                    break;
                case 3:
                    double code = numberOne * numberTwo;
                    System.err.println("kết quả của phép nhân là " + code);
                    break;
                case 4:
                    double divide = numberOne / numberTwo;
                    System.err.println("kết quả của phép chia " + divide);
                    break;
                case 5:
                    System.exit(1);
            }


        } while (true);
    }
}

