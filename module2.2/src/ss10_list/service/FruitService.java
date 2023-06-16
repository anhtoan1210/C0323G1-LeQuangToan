package ss10_list.service;

import ss10_list.model.Fruit;
import ss10_list.repository.FruitRepository;
import ss10_list.repository.IFruitRepository;

import java.util.List;
import java.util.Scanner;

public class FruitService implements IFruitService {
    private IFruitRepository fruitRepository = new FruitRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Fruit> fruits = fruitRepository.getAll();
        for (Fruit f : fruits) {
            System.out.println(f);
        }
    }

    @Override
    //tring nameFruit, String kindOfFruit, int dateOfManufacture,
    // int expiry, String origin, float price
    public void add() {
        System.out.println("Nhập tên trái cây");
        String name = scanner.nextLine();
        System.out.println("nhập loại trái cây ");
        String kindOfFruit = scanner.nextLine();
        System.out.println("Nhập ngày sản xuất");
        int dateOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập hạn sử dụng");
        int expiry = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập nguồn gốc");
        String origin = scanner.nextLine();
        System.out.println("nhập giá");
        float price = Float.parseFloat(scanner.nextLine());
        Fruit fruit = new Fruit(name, kindOfFruit, dateOfManufacture, expiry, origin, price);
        fruitRepository.add(fruit);
        System.out.println("Thêm mới thành công");


    }
}
