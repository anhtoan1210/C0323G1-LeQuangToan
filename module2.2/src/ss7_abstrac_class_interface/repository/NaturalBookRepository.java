package ss7_abstrac_class_interface.repository;

import ss7_abstrac_class_interface.common.ReadAndWrite;
import ss7_abstrac_class_interface.model.NaturalBook;

import java.util.ArrayList;
import java.util.List;

public class NaturalBookRepository implements INaturalBookRepository {
    private static List<NaturalBook> naturalBooks = new ArrayList<>();
    private static final String PATH_NATURALBOOK = "src/ss7_abstrac_class_interface/data/file_narutalBook.csv";

    @Override
    public List<NaturalBook> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_NATURALBOOK);
        naturalBooks.clear();
        String[] info;
        for (String s : strings) {
            info = s.split(",");
            naturalBooks.add(new NaturalBook(info[0], info[1], Integer.parseInt(info[2]), Integer.parseInt(info[3])));
        }
        return naturalBooks;
    }
//String bookName, String publishingCompany, int publishingYear, int numberOfPublications
    @Override
    public void add(NaturalBook naturalBook) {
        List<String> strings = new ArrayList<>();
        //String bookName, String publishingCompany, int publishingYear, int numberOfPublications
        strings.add(naturalBook.getBookName() + "," + naturalBook.getPublishingCompany() + "," + naturalBook.getPublishingYear() + "," + naturalBook.getNumberOfPublications());
        ReadAndWrite.writeFile(PATH_NATURALBOOK, strings, true);
    }
}
