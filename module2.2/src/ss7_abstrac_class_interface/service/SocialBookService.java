package ss7_abstrac_class_interface.service;

import ss7_abstrac_class_interface.common.ReadAndWrite;
import ss7_abstrac_class_interface.model.SocialBook;
import ss7_abstrac_class_interface.repository.ISocialBookRepository;
import ss7_abstrac_class_interface.repository.SocialBookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SocialBookService implements ISocialBookService {
    private static ISocialBookRepository socialBookRepository = new SocialBookRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<SocialBook> socialBooks = socialBookRepository.getAll();
        for (SocialBook s : socialBooks) {
            System.out.println(s);
        }

    }

    @Override
    public void add() {
        //  //String bookName, String publishingCompany, int publishingYear, String author
        //(String bookName, String publishingCompany, int publishingYear, String author
        System.out.println("nhập tên sách");
        String bookName = scanner.nextLine();
        System.out.println("Nhập công ty xuất bản");
        String publishingCompany = scanner.nextLine();
        System.out.println("Nhập năm sản xuat");
        int publishingYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tác giả");
        String author = scanner.nextLine();
        SocialBook socialBook = new SocialBook(bookName, publishingCompany, publishingYear, author);
        socialBookRepository.add(socialBook);
        System.out.println("Thêm mới thành công");

    }
}
