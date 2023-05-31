package castudy.controller;

import java.util.Scanner;

public class PromotionController {
    Scanner scanner = new Scanner(System.in);

    public void showMenuPromotion() {
        boolean flag = true;
        do {
            System.out.println("1.Display list customers use service\n" +
                    "2.Display list customers get voucher\n" +
                    "3.Return main menu\n");
            String str = scanner.nextLine();
            switch (str) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
            }
        } while (flag);
    }
}
