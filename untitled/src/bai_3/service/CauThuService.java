package bai_3.service;

import bai_3.model.CauThu;
import bai_3.repository.CauThuRepository;
import bai_3.repository.ICauThuRepository;

import java.util.List;
import java.util.Scanner;

public class CauThuService implements ICauThuService {
    private static ICauThuRepository cauThuRepository = new CauThuRepository();
    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAll() {
        List<CauThu> cauThus = cauThuRepository.getAll();
        for (CauThu c : cauThus) {
            System.out.println(c);
        }

    }

    @Override
    public void add() {
        System.out.println("nhập mã cầu thủ");
        String ma = scanner.nextLine();
        System.out.println("nhập họ va tên cầu thủ");
        String hoVaTen = scanner.nextLine();
        System.out.println("nhập ngày sinh cầu thủ");
        int ngaySinh = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập địa chỉ");
        String diaChi = scanner.nextLine();
        System.out.println("nhập đội tuyển");
        String doiTuyen = scanner.nextLine();
        CauThu cauThu = new CauThu(ma, hoVaTen, ngaySinh, diaChi, doiTuyen);
        cauThuRepository.add(cauThu);
        System.out.println("thêm mới thành công");
    }
}
