package ss4_class_object.cotroller;

import ss4_class_object.model.Doctor;
import ss4_class_object.service.DoctorService;
import ss4_class_object.service.IDoctorService;

import java.util.Scanner;

public class DoctorController {
    private static IDoctorService doctorService = new DoctorService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        do {


            System.out.println("--------------");
            System.out.println("Mời bạn lựa chọn chức năng");
            System.out.println("1.hiển thị");
            System.out.println("2.Thêm mới");
            System.out.println("3.thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    doctorService.display();
                    break;
                case 2:
                    doctorService.add();
                    break;
                case 3:
                    System.exit(1);
                    break;
            }
        } while (true);
    }
}
