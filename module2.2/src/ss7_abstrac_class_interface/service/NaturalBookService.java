package ss7_abstrac_class_interface.service;

import ss7_abstrac_class_interface.model.NaturalBook;
import ss7_abstrac_class_interface.repository.INaturalBookRepository;
import ss7_abstrac_class_interface.repository.NaturalBookRepository;

import java.util.List;
import java.util.Scanner;

public class NaturalBookService implements INaturalBookService {
    private static INaturalBookRepository naturalBookRepository = new NaturalBookRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<NaturalBook> naturalBooks = naturalBookRepository.getAll();
        for (NaturalBook n : naturalBooks) {
            System.out.println(n);
        }

    }

    @Override
    public void add() {
        //String bookName, String publishingCompany, int publishingYear, int numberOfPublications
        System.out.println("Nhập tên sách");
        String bookName = scanner.nextLine();
        System.out.println("Công ty xuất bản");
        String publishingCompany = scanner.nextLine();
        System.out.println("Năm xuất bản");
        int publishingYear = Integer.parseInt( scanner.nextLine());
        System.out.println("so luong xuat ban");
        int numberOfPublications = Integer.parseInt(scanner.nextLine());
        NaturalBook naturalBook = new NaturalBook(bookName, publishingCompany,publishingYear, numberOfPublications);
        naturalBookRepository.add(naturalBook);
        System.out.println("thêm mới thành công");
    }
}
