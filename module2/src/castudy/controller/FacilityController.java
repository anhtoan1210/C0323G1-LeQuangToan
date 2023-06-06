package castudy.controller;

import castudy.service.FacilityService;

import java.util.Scanner;

public class FacilityController {
    private static final FacilityService facilityService = new FacilityService();
    Scanner scanner = new Scanner(System.in);

    public void showMenuFacility() {
        boolean flag = true;
        do {
            System.out.println("1.Display list \n" +
                    "2.Add new facility\n" +
                    "3. Xoá\n" +
                    "4.Display list facility maintenance\n" +
                    "5.Return main menu\n");
            String str = scanner.nextLine();
            switch (str) {
                case "1":
                    facilityService.displayFacility();
                    break;
                case "2":
                    facilityService.addFacility();
                    break;
                case "3":
                    facilityService.deleteFacility();
                    break;
                case "4":
                    facilityService.displayFacilityMaintain();
                    break;
                case "5":
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
