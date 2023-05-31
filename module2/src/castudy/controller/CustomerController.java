package castudy.controller;

import java.util.Scanner;

public class CustomerController {
    Scanner scanner = new Scanner(System.in);

    public void showMenuCustomer() {
        boolean flag = true;
        do {
            System.out.println("1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return main menu\n");
            String str = scanner.nextLine();
            switch (str) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
            }
        } while (flag);
    }

}
