package ss7_abstrac_class_interface.controller;

import ss7_abstrac_class_interface.model.NaturalBook;

import java.util.Scanner;

public class MenuController {
    private static Scanner scanner = new Scanner(System.in);
    private static NaturalBookController naturalBookController = new NaturalBookController();
    private static SocialBookController socialBookController = new SocialBookController();

    public static void menuController() {
        do {
            System.out.println("--------------");
            System.out.println("---Mời bạn lựa chọn chức năng---");
            System.out.println("---1.NaturalBook---");
            System.out.println("---2.SocialBook---");
            System.out.println("0.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    naturalBookController.menuNaturalBook();
                    break;
                case 2:
                    socialBookController.menuSocialBook();
                    break;

                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Mời bạn chọn các chức năng có trong menu");
            }


        } while (true);
    }

}
