package ss17_io_text_binary.repository;

import ss17_io_text_binary.common.ReadAndWriteBinary;
import ss17_io_text_binary.model.Spending;

import java.util.ArrayList;
import java.util.List;

public class SpendingRepository implements ISpendingRepository {

    private static final String PATH_SPENDING = "src/ss17_io_text_binary/data/spending.dat";

    @Override
    public List<Spending> getAll() {
        List<Spending> spendingList = new ArrayList<>();
        spendingList = ReadAndWriteBinary.readToFileBinary(PATH_SPENDING);
        return spendingList;
    }

    @Override
    public void add(Spending spending) {
        List<Spending> spendingList = new ArrayList<>();
        spendingList = ReadAndWriteBinary.readToFileBinary(PATH_SPENDING);
        spendingList.add(spending);
        ReadAndWriteBinary.writeFileBinary(PATH_SPENDING, spendingList);
    }

    @Override
    public void delete(Spending spending) {
        List<Spending> spendingList = new ArrayList<>();
        spendingList = ReadAndWriteBinary.readToFileBinary(PATH_SPENDING);
        spendingList.remove(spending);
        ReadAndWriteBinary.writeFileBinary(PATH_SPENDING, spendingList);
    }

    @Override
    public void edit(int index,Spending spending) {
        List<Spending> spendingList = new ArrayList<>();
        spendingList = ReadAndWriteBinary.readToFileBinary(PATH_SPENDING);
        spendingList.set(index,spending);
        ReadAndWriteBinary.writeFileBinary(PATH_SPENDING, spendingList);

    }

    @Override
    public void search(String name) {
        List<Spending> spendings = getAll();
        for (Spending s : spendings) {
            if (s.getSpendingName().contains(name)) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void searchId(String id) {
        List<Spending> spendings = getAll();
        for (Spending s : spendings) {
            if (s.getSpendingCode().equals(id)) {
                System.out.println(s);
            }
        }

    }

    @Override
    public List<Spending> sortName(List<Spending> spendingList) {
        spendingList = getAll();
        return spendingList;
    }


    @Override
    public Spending getById(String codeById) {
        List<Spending> spendings = getAll();
        for (Spending s : spendings) {
            if (s.getSpendingCode().equals(codeById)) {
                return s;
            }
        }
        return null;
    }
}
