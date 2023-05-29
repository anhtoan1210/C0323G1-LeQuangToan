package mvc_lam_them.controller;

import java.util.Scanner;

public class MenuCotroller {
    private TeacherController teacherController = new TeacherController();
    private StudentController studentController = new StudentController();

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1.student\n" +
                    "2.teacher\n" +
                    "3.thoat\n" +
                    "Moi ban lua chon chuc nang");
            String str = scanner.nextLine();
            switch (str) {
                case "1":
                    break;
                case "2":
                    teacherController.menuTeacher();
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("moi ban nhap lai");
                    break;
            }

        } while (flag);

    }
}
