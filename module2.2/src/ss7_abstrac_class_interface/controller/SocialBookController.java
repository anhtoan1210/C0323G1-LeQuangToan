package ss7_abstrac_class_interface.controller;

import ss7_abstrac_class_interface.service.SocialBookService;

import java.util.Scanner;

public class SocialBookController {
    private static SocialBookService socialBookService = new SocialBookService();
    private static Scanner scanner = new Scanner(System.in);

    public  void menuSocialBook() {
        do {
            System.out.println("----------");
            System.out.println("--- Mời bạn lựa chọn chức năng---");
            System.out.println("---1.Hiển thị---");
            System.out.println("---2.Thêm mới---");
            System.out.println("---0.Thoát---");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    socialBookService.display();
                    break;
                case 2:
                    socialBookService.add();
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Mời bạn nhập lại các chức năng có trong Menu");
            }

        } while (true);
    }
}
