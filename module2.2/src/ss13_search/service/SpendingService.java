package ss13_search.service;

import ss13_search.model.Spending;
import ss13_search.repository.SpendingRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SpendingService implements ISpendingService {
    private static Scanner scanner = new Scanner(System.in);
    private static SpendingRepository spendingRepository = new SpendingRepository();

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

    }

    @Override
    public void search() {
        System.out.println("nhập tên bạn muốn tìm kiếm");
        String name = scanner.nextLine();
        spendingRepository.search(name);
    }

    @Override
    public void searchId() {
        System.out.println("nhập ID bạn muốn tìm kiếm");
        String id = scanner.nextLine();
        spendingRepository.searchId(id);
    }

    @Override
    public void sortName() {

    }
}


