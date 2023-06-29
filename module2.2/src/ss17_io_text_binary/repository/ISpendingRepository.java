package ss17_io_text_binary.repository;

import ss17_io_text_binary.model.Spending;

import java.util.List;

public interface ISpendingRepository {
    List<Spending> getAll();

    void add(Spending spending);

    void delete(Spending spending);

    void edit(int index,Spending spending);

    void search(String name);
    void searchId(String id);
   List<Spending>sortName(List<Spending> spendingList);
    Spending getById(String codeById);
}
