package castudy.controller;

import java.util.Scanner;

public class FacilityController {
    Scanner scanner = new Scanner(System.in);

    public void showMenuFacility() {
        boolean flag = true;
        do {
            System.out.println("1.Display list \n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
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
