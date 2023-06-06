package castudy.service;

import castudy.model.facility.Facility;
import castudy.model.facility.HouseForRent;
import castudy.model.facility.RoomForRent;
import castudy.model.facility.VillaForRent;
import castudy.repository.FacilityRepository;
import castudy.utils.Regex;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static FacilityRepository facilityRepository = new FacilityRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayFacility() {
        Map<Facility, Integer> facilityMap = facilityRepository.getData();
        for (Facility f : facilityMap.keySet()) {
            System.out.println(f);
        }
    }

    @Override
    public void displayFacilityMaintain() {
        List<Facility> facilities = facilityRepository.getFacilityMaintain();
        for (Facility f : facilities) {
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
                    System.out.println("nhập mã dịch vụ");
                    serviceCode = scanner.nextLine();
                } while (!Regex.checkIdVilla(serviceCode));
                String serviceName;
                do {
                    System.out.println("nhập tên dịch vụ");
                    serviceName = scanner.nextLine();
                } while (!Regex.checkServiceName(serviceName));
                float usableArea;
                while (true) {
                    try {
                        System.out.println("nhập diện tic sử dụng");
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
                        System.out.println("nhập chi phí thuê");
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
                        System.out.println("nhập số lượng người tối đa");
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
                    System.out.println("nhập kiểu thuê");
                    rentalType = scanner.nextLine();
                } while (!Regex.checkType(rentalType));
                String roomStandard;
                do {
                    System.out.println("Nhập tiêu chuẩn phong");
                    roomStandard = scanner.nextLine();
                } while (!Regex.checkServiceName(roomStandard));
                float swimmingPoolArea;
                while (true) {
                    try {
                        System.out.println("nhập diện tích hồ bơi");
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
                        System.out.println(" Nhập vào số tâng");
                        floors = Integer.parseInt(scanner.nextLine());
                        if (floors > 0) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println(" nhập sô");
                    }
                }
                VillaForRent villaForRent = new VillaForRent(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, swimmingPoolArea, floors);
                facilityRepository.addFacility(villaForRent);
                System.out.println("thêm mới thành công");
                break;
            case 2:
//String serviceCode, String serviceName, float usableArea, long rentalCosts, int maximumNumberOfPeople,
// String rentalType, String roomStandard, int numberOfFloors

                do {
                    System.out.println("nhập mã ");
                    serviceCode = scanner.nextLine();
                } while (!Regex.checkIdHouse(serviceCode));

                do {
                    System.out.println("nhập tên dịch vụ");
                    serviceName = scanner.nextLine();
                } while (!Regex.checkServiceName(serviceName));
                while (true) {
                    try {
                        System.out.println("nhập diện tích sử dụng");
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
                        System.out.println("Nhập chi phí thuê");
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
                        System.out.println(" nhập số lượng người");
                        maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                        if (maximumNumberOfPeople > 0 && maximumNumberOfPeople < 20) {
                            break;
                        }

                    } catch (NumberFormatException numberFormatException) {
                        System.out.println(" vui lòng nhập số");
                    }
                }
                do {
                    System.out.println("Nhập kiểu thuê");
                    rentalType = scanner.nextLine();
                } while (!Regex.checkType(rentalType));
                do {
                    System.out.println("nhập tiêu chuẩn phòng");
                    roomStandard = scanner.nextLine();
                } while (!Regex.checkServiceName(roomStandard));
                while (true) {
                    try {
                        System.out.println("nhập số tầng");
                        floors = Integer.parseInt(scanner.nextLine());
                        if (floors > 0) {
                            break;
                        }

                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Vui lòng nhập số");
                    }
                }
                HouseForRent houseForRent = new HouseForRent(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, floors);
                facilityRepository.addFacility(houseForRent);
                System.out.println("Thêm quá thành công");
            case 3:
                //String serviceCode, String serviceName, float usableArea, long rentalCosts, int maximumNumberOfPeople,
                // String rentalType, String freeServiceIncluded
                do {
                    System.out.println("nhập mã dịch vụ");
                    serviceCode = scanner.nextLine();
                } while (!Regex.checkIdRoom(serviceCode));
                do {
                    System.out.println("Nhập tên dịch vụ");
                    serviceName = scanner.nextLine();
                } while (!Regex.checkServiceName(serviceName));
                while (true) {
                    try {
                        System.out.println("nhập diện tích sử dụng");
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
                        System.out.println("Nhập chi phí thuê");
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
                        System.out.println("nhập sô lượng người");
                        maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                        if (maximumNumberOfPeople > 0 && maximumNumberOfPeople < 20) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Vui lòng nhập số");
                    }
                }
                do {
                    System.out.println("nhập kiểu thuê");
                    rentalType = scanner.nextLine();
                } while (!Regex.checkType(rentalType));
                String freeServiceIncluded;
                System.out.println("nhập dịch vụ miễn phí");
                freeServiceIncluded = scanner.nextLine();
                RoomForRent roomForRent = new RoomForRent(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, freeServiceIncluded);
                facilityRepository.addFacility(roomForRent);
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
                facilityRepository.removeFacility(facility);
                System.out.println("xoá oke");
            } else {
                System.out.println("");
            }
        }

    }
}
