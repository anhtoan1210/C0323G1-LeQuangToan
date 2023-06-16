package ss7_abstrac_class_interface.controller;

import ss7_abstrac_class_interface.model.NaturalBook;
import ss7_abstrac_class_interface.service.INaturalBookService;
import ss7_abstrac_class_interface.service.NaturalBookService;

import java.util.Scanner;

public class NaturalBookController {
    private static INaturalBookService naturalBookService = new NaturalBookService();
    private static Scanner scanner = new Scanner(System.in);

    public  void menuNaturalBook() {
        do {
            System.out.println("------------------");
            System.out.println("----Mời bạn lựa chọn chức năng---");
            System.out.println("---1.Hiển thị danh sách---");
            System.out.println("---2.Thêm mới---");
            System.out.println("---0.thoát---");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    naturalBookService.display();
                    break;
                case 2:
                    naturalBookService.add();
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Bạn nhập sai mời bạn nhập lại");
                    break;

            }
        } while (true);
    }
}
