package bai_3.controller;

import bai_3.model.CauThu;
import bai_3.service.CauThuService;

import java.util.Scanner;

public class CauThuController {
    private static CauThuService cauThuService = new CauThuService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        do {
            System.out.println("----------------");
            System.out.println("Mời bạn lựa chọn chức năng");
            System.out.println("1.hiển thị danh sách cầu thủ");
            System.out.println("2.Thêm mới cầu thủ");
            System.out.println("3.thực hiện sút penalty");
            System.out.println("0.thoát");
            int choice = Integer.parseInt(scanner.next());
            switch (choice) {
                case 1:
                    cauThuService.displayAll();
                    break;
                case 2:
                    cauThuService.add();
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("mời bạn nhập đúng chức năng đã hiển thị");
            }

        } while (true);
    }
}
