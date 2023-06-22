package ss13_search.service;

import ss13_search.model.Spending;
import ss13_search.repository.SpendingRepository;
import ss13_search.utils.SortByName;

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
        System.out.println("Nhập mã chi tiêu");
        String id = scanner.nextLine();
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
        System.out.println("nhập id mà bạn muôn xoá");
        String id = scanner.nextLine();
        Spending spending = spendingRepository.getById(id);
        if (spending == null) {
            System.out.println("Mã chi toeeu không tồn tại");
        } else {
            System.out.println("Bạn có chắc chắn muốn xoá");
            System.out.println("1.Có");
            System.out.println("2.Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                spendingRepository.delete(spending);
                System.out.println("Xoá oke");
            }
        }
    }

    @Override
    public void edit() {
        System.out.println("nhập mã chi tiêu cần chỉnh sửa");
        String id = scanner.nextLine();
        Spending spending = spendingRepository.getById(id);
        if (spending == null) {
            System.out.println("mã chi tiêu khong tồn tại");
        } else {
            spendingRepository.delete(spending);
            while (true) {
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
                        Spending spending1 = new Spending(id, name, spending.getSpendingDate(), spending.getAmountOfMoney(), spending.getMoreDescription());
                        spendingRepository.add(spending1);
                        System.out.println("Sửa thành công");
                        break;
                    case "2":
                        System.out.println("Nhập ngày chi tiêu");
                        int spendingDate = Integer.parseInt(scanner.nextLine());
                        Spending spending2 = new Spending(id, spending.getSpendingName(), spendingDate, spending.getAmountOfMoney(), spending.getMoreDescription());
                        spendingRepository.add(spending2);
                        System.out.println("Sửa thành công");
                        break;
                    case "3":
                        System.out.println("Nhập số tiền");
                        float amountOfMoney = Float.parseFloat(scanner.nextLine());
                        Spending spending3 = new Spending(id, spending.getSpendingName(), spending.getSpendingDate(), amountOfMoney, spending.getMoreDescription());
                        spendingRepository.add(spending3);
                        System.out.println("Sửa thành công");
                        break;
                    case "4":
                        System.out.println("Nhập mô tả");
                        String moreDescription = scanner.nextLine();
                        Spending spending4 = new Spending(id, spending.getSpendingName(), spending.getSpendingDate(), spending.getAmountOfMoney(), moreDescription);
                        spendingRepository.add(spending4);
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


