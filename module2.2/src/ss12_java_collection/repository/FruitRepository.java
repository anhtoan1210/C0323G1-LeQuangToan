package ss12_java_collection.repository;

import ss12_java_collection.common.ReadAndWrite;
import ss12_java_collection.model.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FruitRepository implements IFruitRepository {
    private static Set<Fruit> fruits = new TreeSet<>();
    private static final String PATH_FRUITS = "src/ss12_java_collection/data/fruit.csv";

    @Override
    public Set<Fruit> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_FRUITS);
        fruits.clear();
        String[] info;
        for (String s : strings) {
            info = s.split(",");
            fruits.add(new Fruit(info[0], info[1], Integer.parseInt(info[2]), Integer.parseInt(info[3]), info[4], Float.parseFloat(info[5])));
        }
        return fruits;
    }

    @Override
    public void add(Fruit fruit) {
        List<String> strings = new ArrayList<>();
        //fruit.getNameFruit() + "," + fruit.getKindOfFruit() + "," + fruit.getDateOfManufacture() + "," +
        // fruit.getExpiry() + "," + fruit.getOrigin() + "," + fruit.getPrice());
        strings.add(fruit.getNameFruit() + "," + fruit.getKindOfFruit() + "," + fruit.getDateOfManufacture() + "," + fruit.getExpiry() + "," + fruit.getOrigin() + "," + fruit.getPrice());
        ReadAndWrite.writeFile(PATH_FRUITS, strings, true);
    }

    @Override
    public void delete(Fruit fruit) {
        fruits = getAll();
        fruits.remove(fruit);
        List<String> strings = new ArrayList<>();
        for (Fruit f : fruits) {
            strings.add(f.getNameFruit() + "," + f.getKindOfFruit() + "," + f.getDateOfManufacture() + "," + f.getExpiry() + "," + f.getOrigin() + "," + f.getPrice());
        }
        ReadAndWrite.writeFile(PATH_FRUITS, strings, false);
    }

    @Override
    public Fruit getByName(String name) {
        fruits = getAll();
        for (Fruit f : fruits) {
            if (f.getNameFruit().equals(name)) {
                return f;
            }
        }
        return null;
    }


    @Override
    public void edit(Fruit fruit) {
        fruits = getAll();
        List<String> strings = new ArrayList<>();
        for (Fruit f : fruits) {
            if (f.getNameFruit().equals(fruit.getNameFruit())) {
                f = fruit;
            }
        }
        ReadAndWrite.writeFile(PATH_FRUITS, strings, true);
    }
}
