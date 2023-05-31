package castudy.controller;

import java.util.Scanner;

public class BookingCotroller {
    Scanner scanner = new Scanner(System.in);

    public void showMenuBooking() {
        boolean falg = true;
        do {
            System.out.println("1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Create new contracts\n" +
                    "4.Display list contracts\n" +
                    "5.Edit contracts\n" +
                    "6.Return main menu\n");
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
                case "5":
                    break;
                case "6":
                    break;
            }
        } while (falg);
    }
}
