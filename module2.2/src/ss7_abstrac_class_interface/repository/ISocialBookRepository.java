package ss7_abstrac_class_interface.repository;

import ss7_abstrac_class_interface.model.SocialBook;

import java.util.List;

public interface ISocialBookRepository {
    List<SocialBook> getAll();

    void add(SocialBook socialBook);
}
