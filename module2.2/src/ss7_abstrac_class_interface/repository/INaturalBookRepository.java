package ss7_abstrac_class_interface.repository;

import ss7_abstrac_class_interface.model.NaturalBook;

import java.util.List;

public interface INaturalBookRepository {
    List<NaturalBook> getAll();

    void add(NaturalBook naturalBook);
}
