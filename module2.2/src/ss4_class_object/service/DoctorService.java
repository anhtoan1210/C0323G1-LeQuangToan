package ss4_class_object.service;

import ss4_class_object.model.Doctor;
import ss4_class_object.repository.DoctorRepository;

import java.util.List;
import java.util.Scanner;

public class DoctorService implements IDoctorService {
    private static DoctorRepository doctorRepository = new DoctorRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Doctor> doctors = doctorRepository.getAll();
        for (Doctor s : doctors) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        //String name, int yearOld, String address, String email, long numberPhone, String workingPosition
        System.out.println("nhập tên bác sĩ mà bạn muốn thêm");
        String name = scanner.nextLine();
        System.out.println("Nhập năm sinh");
        int yearOld = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập email");
        String email = scanner.nextLine();
        System.out.println("nhập số điện thoại");
        long numberPhone = Long.parseLong(scanner.nextLine());
        System.out.println("nhâ vị trí làm việc");
        String workingPosition = scanner.nextLine();
        Doctor doctor = new Doctor(name, yearOld, address, email, numberPhone, workingPosition);
        doctorRepository.add(doctor);
        System.out.println("thêm mới oke");
    }
}
