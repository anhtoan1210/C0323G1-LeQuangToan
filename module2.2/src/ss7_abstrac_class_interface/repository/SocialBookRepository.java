package ss7_abstrac_class_interface.repository;

import ss7_abstrac_class_interface.common.ReadAndWrite;
import ss7_abstrac_class_interface.model.SocialBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SocialBookRepository implements ISocialBookRepository {
    private static List<SocialBook> socialBooks = new ArrayList<>();
    private static final String PATH_NATURALBOOK = "src/ss7_abstrac_class_interface/data/file.csv";

    @Override
    public List<SocialBook> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_NATURALBOOK);
        socialBooks.clear();
        String[] info;
        for (String s : strings) {
            info = s.split(",");
            //String bookName, String publishingCompany, int publishingYear, String author
            socialBooks.add(new SocialBook(info[0], info[1], Integer.parseInt(info[2]), info[3]));
        }
        return socialBooks;
    }

    @Override
    public void add(SocialBook socialBook) {
        List<String> strings = new ArrayList<>();
        strings.add(socialBook.getBookName() + socialBook.getPublishingCompany() + socialBook.getPublishingYear() + socialBook.getAuthor());
        ReadAndWrite.writeFile(PATH_NATURALBOOK, strings, false);
    }
}
