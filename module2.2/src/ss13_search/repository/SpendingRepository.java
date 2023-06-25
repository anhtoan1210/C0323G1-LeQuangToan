package ss13_search.repository;

import ss13_search.common.ReadAndWrite;
import ss13_search.model.Spending;

import java.util.ArrayList;
import java.util.List;

public class SpendingRepository implements ISpendingRepository {
    private static List<Spending> spendings = new ArrayList<>();
    private static final String PATH_SPENDING = "src/ss13_search/data/chi_tieu.csv";

    @Override
    public List<Spending> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_SPENDING);
        spendings.clear();
        String[] info;
        for (String s : strings) {
            if (s != null && !s.equals("")) {
                info = s.split(",");
                spendings.add(new Spending(info[0], info[1], Integer.parseInt(info[2]), Float.parseFloat(info[3]), info[4]));
            }
        }
        return spendings;
    }

    @Override
    public void add(Spending spending) {
        List<String> strings = new ArrayList<>();
        //String spendingCode, String spendingName, int spendingDate, float amountOfMoney, String moreDescription
        strings.add(spending.getSpendingCode() + "," + spending.getSpendingName() + "," + spending.getSpendingDate() + "," + spending.getAmountOfMoney() + "," + spending.getMoreDescription());
        ReadAndWrite.writeFile(PATH_SPENDING, strings, true);
    }

    @Override
    public void delete(Spending spending) {
        spendings = getAll();
        spendings.remove(spending);
        List<String> strings = new ArrayList<>();
        for (Spending s : spendings) {
            strings.add(s.getSpendingCode() + "," + s.getSpendingName() + "," + s.getSpendingDate() + "," + s.getAmountOfMoney() + "," + s.getMoreDescription());
        }
        ReadAndWrite.writeFile(PATH_SPENDING, strings, false);

    }

    @Override
    public void edit(Spending spending) {

    }

    @Override
    public void search(String name) {
        spendings = getAll();
        for (Spending s : spendings) {
            if (s.getSpendingName().contains(name)) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void searchId(String id) {
        spendings = getAll();
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
        spendings = getAll();
        for (Spending s : spendings) {
            if (s.getSpendingCode().equals(codeById)) {
                return s;
            }
        }
        return null;
    }
}
