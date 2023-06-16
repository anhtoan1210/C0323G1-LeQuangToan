package ss10_list.repository;

import ss10_list.common.ReadAndWrite;
import ss10_list.model.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitRepository implements IFruitRepository {
    private static List<Fruit> fruits = new ArrayList<>();
    private static final String PATH_FRUITS = "src/ss10_list/data/file_trai_cay.csv";

    @Override
    public List<Fruit> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_FRUITS);
        fruits.clear();
        String[] info;
        for (String s : strings) {
            info = s.split(",");
            //tring nameFruit, String kindOfFruit, int dateOfManufacture,
            // int expiry, String origin, float price
            fruits.add(new Fruit(info[0], info[1], Integer.parseInt(info[2]), Integer.parseInt(info[3]), info[4], Float.parseFloat(info[5])));
        }
        return fruits;
    }

    @Override
    public void add(Fruit fruit) {
        List<String> strings = new ArrayList<>();
        strings.add(fruit.getNameFruit() + "," + fruit.getKindOfFruit() + "," + fruit.getDateOfManufacture() + "," + fruit.getExpiry() + "," + fruit.getOrigin() + "," + fruit.getPrice());
    ReadAndWrite.writeFile(PATH_FRUITS,strings,true);
    }
}
