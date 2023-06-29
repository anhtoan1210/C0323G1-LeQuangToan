package ss17_io_text_binary.service;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import ss17_io_text_binary.model.Spending;
import ss17_io_text_binary.regex.Check;
import ss17_io_text_binary.repository.SpendingRepository;
import ss17_io_text_binary.utils.SortByName;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SpendingService implements ISpendingService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final SpendingRepository spendingRepository = new SpendingRepository();

    @Override
    public void display() {
        List<Spending> spendings = spendingRepository.getAll();
        for (Spending s : spendings) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        //String spendingCode, String spendingName,
        // int spendingDate, float amountOfMoney, String moreDescription
        String id = "";
        do {
            List<Spending> spendingList = spendingRepository.getAll();
            while (true) {
                System.out.println("Nhập mã chi tiêu theo định dạng SI-XX");
                try {
                    id = scanner.nextLine();
                    for (Spending s : spendingList) {
                        if (id.equals(s.getSpendingCode())) {
                            throw new UniqueIDException("Trung Id");
                        }
                    }
                    break;
                } catch (UniqueIDException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        while (!Check.checkId(id));

        System.out.println("Nhập  tên chi tiêu");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày chi tiêu");
        int spendingDate = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số tiền");
        float amountOfMoney = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập mô tả");
        String moreDescription = scanner.nextLine();
        Spending spending = new Spending(id, name, spendingDate, amountOfMoney, moreDescription);
        spendingRepository.add(spending);
        System.out.println("thêm mới thành công");
    }


    @Override
    public void delete() {
        String id="";
        boolean flag=false;
        do {
            List<Spending> spendingList = spendingRepository.getAll();
            boolean check = false;

            System.out.println("nhập id mà bạn muôn xoá");
            try {
                id = scanner.nextLine();
                for (Spending s : spendingList) {
                    if (s.getSpendingCode().equals(id)) {
                        System.out.println("Ok");
                        flag = true;
                        check = true;
                        System.out.println("Bạn có chắc chắn muốn xoá");
            System.out.println("1.Có");
            System.out.println("2.Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                Spending spending = spendingRepository.getById(id);
                spendingRepository.delete(spending);
                System.out.println("Xoá oke");
            }
                    }
                }
                if (!check) {
                    throw new IdNotFoundException("ID không tồn tại");
                }
            } catch (IdNotFoundException e) {
                System.out.println(e.getMessage());

            }
        }
            while (!flag);
//
//        Spending spending = spendingRepository.getById(id);
//        if (spending == null) {
//            System.out.println("Mã chi toeeu không tồn tại");
//        } else {
//            System.out.println("Bạn có chắc chắn muốn xoá");
//            System.out.println("1.Có");
//            System.out.println("2.Không");
//            int choice = Integer.parseInt(scanner.nextLine());
//            if (choice == 1) {
//                spendingRepository.delete(spending);
//                System.out.println("Xoá oke");
//            }
//        }
    }

    @Override
    public void edit() {
        System.out.println("nhập mã chi tiêu cần chỉnh sửa");
        String id = scanner.nextLine();
        Spending spending = spendingRepository.getById(id);
        if (spending == null) {
            System.out.println("mã chi tiêu khong tồn tại");
        } else {
                System.out.println("Chọn thứ cần chỉnh sửa");
                System.out.println("1.Sửa tên");
                System.out.println("2.Sửa ngày");
                System.out.println("3.Sửa số tiền");
                System.out.println("4.Sửa mô tả");
                System.out.println("0.Exit");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("Nhập  tên chi tiêu");
                        String name = scanner.nextLine();
                        spendingRepository.edit(Integer.parseInt(name),spending);
                        System.out.println("Sửa thành công");
                        break;
                    case "2":
                        System.out.println("Nhập ngày chi tiêu");
                        int spendingDate = Integer.parseInt(scanner.nextLine());
                        System.out.println("Sửa thành công");
                        break;
                    case "3":
                        System.out.println("Nhập số tiền");
                        float amountOfMoney = Float.parseFloat(scanner.nextLine());
                        System.out.println("Sửa thành công");
                        break;
                    case "4":
                        System.out.println("Nhập mô tả");
                        String moreDescription = scanner.nextLine();
                        System.out.println("Sửa thành công");
                        break;
                    case "0":
                        return;
                    default:
                        System.out.println("Nhập sai nhập lại");
                        break;
                }
            }
        }


    @Override
    public void search() {
        System.out.println("nhập tên bạn muốn tìm kiếm");
        String name = scanner.nextLine();
        spendingRepository.search(name);
    }

    @Override
    //ghi đè phương thức tìm kiếm,và triển khai khai cụ thể!
    public void searchId() {
        System.out.println("nhập ID bạn muốn tìm kiếm");
        String id = scanner.nextLine();
        spendingRepository.searchId(id);
    }

    @Override
    public void sortName() {
        List<Spending> spendingList = spendingRepository.getAll();
        spendingList.sort(new SortByName());
        for (Spending s : spendingList) {
            System.out.println(s);
        }
        System.out.println("Ok sắp thành công");
    }

    @Override
    public void sortPrice() {
        List<Spending> spendingList = spendingRepository.getAll();
        Collections.sort(spendingList);
        for (Spending s : spendingList) {
            System.out.println(s);
        }
    }
}


