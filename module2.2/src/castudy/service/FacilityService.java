package castudy.service;

import castudy.model.facility.Facility;
import castudy.model.facility.House;
import castudy.model.facility.Room;
import castudy.model.facility.Villa;
import castudy.regex.Regex;
import castudy.repository.FacilityRepository;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static FacilityRepository facilityRepository = new FacilityRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayFacility() {
        Map<Facility, Integer> facilityIntegerMap = facilityRepository.getData();
        for (Facility f : facilityIntegerMap.keySet()) {
            System.out.println(f);
        }
    }

    @Override
    public void displayFacilityMaintain() {
        List<Facility> facilityList = facilityRepository.getFacilityMaintain();
        for (Facility f : facilityList) {
            System.out.println(f);
        }
    }

    @Override
    public void addFacility() {
        System.out.println("hãy chọn dịch vụ\n" +
                "1.Thêm mới Villa\n" +
                "2.Thêm ới house\n" +
                "3.Thêm mới Room\n" +
                "4.Trở lại \n");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Làm ơn nhập số");
            }
        }
        switch (choice) {
            case 1:
                //String serviceCode, String serviceName, float usableArea, long rentalCosts, int maximumNumberOfPeople
                // , String rentalType, String roomStandard, float swimmingPoolArea, int numberOfFloors)
                String serviceCode;
                do {
                    System.out.println("Nhập mã dịch vụ phải đúng định dạng: SVVL-YYYY");
                    serviceCode = scanner.nextLine();
                } while (!Regex.checkIdVilla(serviceCode));
                String serviceName;
                do {
                    System.out.println("nhập tên dịch vụ phải viết hoa chữ cái đầu");
                    serviceName = scanner.nextLine();
                } while (!Regex.checkServiceName(serviceName));
                float usableArea;
                while (true) {
                    try {
                        System.out.println("nhập diện tic sử dụng lớn hơn 30m2");
                        usableArea = Float.parseFloat(scanner.nextLine());
                        if (usableArea > 30) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("vui lòng nhập số");
                    }
                }
                long rentalCosts;
                while (true) {
                    try {
                        System.out.println("nhập chi phí thuê phải là số dương");
                        rentalCosts = Long.parseLong(scanner.nextLine());
                        if (rentalCosts > 0) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("vui lòng nhập số");
                    }
                }
                int maximumNumberOfPeople;
                while (true) {
                    try {
                        System.out.println("nhập số lượng người tối đa phải lớn hơn không và bé hơn 20");
                        maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                        if (maximumNumberOfPeople > 0 && maximumNumberOfPeople < 20) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("vui lòng nhập số");
                    }
                }
                String rentalType;
                do {
                    System.out.println("nhập kiểu thuê theo định dạng,Năm/tháng/ngày/gio");
                    rentalType = scanner.nextLine();
                } while (!Regex.checkType(rentalType));
                String roomStandard;
                do {
                    System.out.println("Nhập tiêu chuẩn phong viết hoa các chữ cái đầu tiên");
                    roomStandard = scanner.nextLine();
                } while (!Regex.checkServiceName(roomStandard));
                float swimmingPoolArea;
                while (true) {
                    try {
                        System.out.println("nhập diện tích hồ bơi phải lớn hơn 30m2");
                        swimmingPoolArea = Float.parseFloat(scanner.nextLine());
                        if (swimmingPoolArea > 30) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Vui lòng nhập số");
                    }
                }
                int floors;
                while (true) {
                    try {
                        System.out.println(" Nhập vào số tâng phải lớn hơn 0");
                        floors = Integer.parseInt(scanner.nextLine());
                        if (floors > 0) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println(" nhập sô");
                    }
                }
                Villa villa = new Villa(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, swimmingPoolArea, floors);
                facilityRepository.add(villa);
                System.out.println("thêm mới thành công");
                break;
            case 2:
//String serviceCode, String serviceName, float usableArea, long rentalCosts, int maximumNumberOfPeople,
// String rentalType, String roomStandard, int numberOfFloors

                do {
                    System.out.println("Nhập mã dịch vụ phải đúng định dạng: SVHO-YYYY ");
                    serviceCode = scanner.nextLine();
                } while (!Regex.checkIdHouse(serviceCode));

                do {
                    System.out.println("nhập tên dịch vụ phải viết hoa chữ cái đầu");
                    serviceName = scanner.nextLine();
                } while (!Regex.checkServiceName(serviceName));
                while (true) {
                    try {
                        System.out.println("nhập diện tích sử dụng phải lớn hơn 30 m2");
                        usableArea = Float.parseFloat(scanner.nextLine());
                        if (usableArea > 30) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("vui lòng nhập số");
                    }
                }

                while (true) {
                    try {
                        System.out.println("Nhập chi phí thuê phải là số dương");
                        rentalCosts = Long.parseLong(scanner.nextLine());
                        if (rentalCosts > 0) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("vui lòng nhập số");
                    }
                }
                while (true) {
                    try {
                        System.out.println(" nhập số lượng người lớn hơn 0 và bé hơn 20");
                        maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                        if (maximumNumberOfPeople > 0 && maximumNumberOfPeople < 20) {
                            break;
                        }

                    } catch (NumberFormatException numberFormatException) {
                        System.out.println(" vui lòng nhập số");
                    }
                }
                do {
                    System.out.println("Nhập kiểu thuê theo định dạng năm/ngay/thang/gio");
                    rentalType = scanner.nextLine();
                } while (!Regex.checkType(rentalType));
                do {
                    System.out.println("nhập tiêu chuẩn phòng viết hoa chữ cái đầu tieen");
                    roomStandard = scanner.nextLine();
                } while (!Regex.checkServiceName(roomStandard));
                while (true) {
                    try {
                        System.out.println("nhập số tầng phải lớn hơn 0");
                        floors = Integer.parseInt(scanner.nextLine());
                        if (floors > 0) {
                            break;
                        }

                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Vui lòng nhập số");
                    }
                }
                House house = new House(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, floors);
                facilityRepository.add(house);
                System.out.println("Thêm quá thành công");
            case 3:
                //String serviceCode, String serviceName, float usableArea, long rentalCosts, int maximumNumberOfPeople,
                // String rentalType, String freeServiceIncluded
                do {
                    System.out.println("Nhập mã dịch vụ phải đúng định dạng: SVRO-YYYY");
                    serviceCode = scanner.nextLine();
                } while (!Regex.checkIdRoom(serviceCode));
                do {
                    System.out.println("Nhập tên dịch vụ phải viết hoa chữ cái đầu");
                    serviceName = scanner.nextLine();
                } while (!Regex.checkServiceName(serviceName));
                while (true) {
                    try {
                        System.out.println("nhập diện tích sử dụng phải lớn hơn 30m2");
                        usableArea = Float.parseFloat(scanner.nextLine());
                        if (usableArea > 30) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Vui lòng nhập số");
                    }
                }
                while (true) {
                    try {
                        System.out.println("Nhập chi phí thuê phải là số dương");
                        rentalCosts = Long.parseLong(scanner.nextLine());
                        if (rentalCosts > 0) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Vui lòng nhập số");
                    }
                }
                while (true) {
                    try {
                        System.out.println("nhập sô lượng người phải lớn hơn 0 và <20");
                        maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                        if (maximumNumberOfPeople > 0 && maximumNumberOfPeople < 20) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Vui lòng nhập số");
                    }
                }
                do {
                    System.out.println("nhập kiểu thuê theo định dạng năm/thang/ngày/giờ");
                    rentalType = scanner.nextLine();
                } while (!Regex.checkType(rentalType));
                String freeServiceIncluded;
                System.out.println("nhập dịch vụ miễn phí");
                freeServiceIncluded = scanner.nextLine();
                Room room = new Room(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, freeServiceIncluded);
                facilityRepository.add(room);
                System.out.println("Thêm mới quá thành công");
        }

    }

    @Override
    public void deleteFacility() {
        System.out.println("nhập id muốn xoá");
        String id = scanner.nextLine();
        Facility facility = facilityRepository.getById(id);
        if (facility == null) {
            System.out.println("không tìm thấy id cần xoá");
        } else {
            System.out.println("bạn có chắc chắn muốn xoá\n" +
                    "1.có\n" +
                    "2.không\n");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("vui lòng nhập số");
                }
            }
            if (choice == 1) {
                facilityRepository.delete(facility);
                System.out.println("xoá oke");
            } else {
                System.out.println("");
            }
        }

    }
}