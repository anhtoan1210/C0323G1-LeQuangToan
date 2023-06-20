package ss12_java_collection.repository;

import ss12_java_collection.model.Fruit;

import java.util.List;
import java.util.Set;

public interface IFruitRepository {
    Set<Fruit> getAll();

    void add(Fruit fruit);

    void delete(Fruit fruit);

    Fruit getByName(String name);

    void edit(Fruit fruit);

}
