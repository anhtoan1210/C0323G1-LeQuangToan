package ss13_search.repository;

import ss13_search.model.Spending;

import java.util.List;

public interface ISpendingRepository {
    List<Spending> getAll();

    void add(Spending spending);

    void delete(Spending spending);

    void edit(Spending spending);

    void search(String name);
    void searchId(String id);
    List<Spending> sortName(List<Spending> spendingList);


    Spending getById(String codeById);
}
