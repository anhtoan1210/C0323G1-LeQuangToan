package ss12_java_collection.service;

import ss12_java_collection.model.Fruit;
import ss12_java_collection.repository.FruitRepository;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FruitService implements IFruitService {
    private static FruitRepository fruitRepository = new FruitRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        Set<Fruit> fruits = fruitRepository.getAll();
        for (Fruit f : fruits) {
            System.out.println(f);
        }
    }

    @Override
    public void add() {
//String nameFruit, String kindOfFruit, int dateOfManufacture, int expiry, String origin, float price
        System.out.println("Nhập tên trái cây");
        String name = scanner.nextLine();
        System.out.println("Nhập loại trái cây");
        String kindOfFruit = scanner.nextLine();
        System.out.println("nhập ngày sản xuất");
        int dateOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hạn sử dụng");
        int expiry = Integer.parseInt(scanner.nextLine());
        System.out.println("nhâp nguồn gốc");
        String origin = scanner.nextLine();
        System.out.println("nhập giá");
        float price = Float.parseFloat(scanner.nextLine());
        Fruit fruit = new Fruit(name, kindOfFruit, dateOfManufacture, expiry, origin, price);
        fruitRepository.add(fruit);
        System.out.println("Thêm mới thành công");


    }

    @Override
    public void delete() {
        System.out.println("nhap ten trai cay muon xoa");
        String name = scanner.nextLine();
        Fruit fruit = fruitRepository.getByName(name);
        if (fruit == null) {
            System.out.println("Không tìm thấy trái cây muốn xoá");
        } else {
            System.out.println("Bạn có chắc chắn muốn xoá");
            System.out.println("1.có");
            System.out.println("2.Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                fruitRepository.delete(fruit);
                System.out.println("Xoá quá thành công");
            }

        }
    }

    @Override
    public void edit() {
        System.out.println("nhap ten trai cay muon sửa");
        String name = scanner.nextLine();
        Fruit fruit = fruitRepository.getByName(name);
        if (fruit == null) {
            System.out.println("Không tìm thấy trái cây muốn sửa");
        } else {
            System.out.println("Nhập loại trái cây");
            String kindOfFruit = scanner.nextLine();
            System.out.println("nhập ngày sản xuất");
            int dateOfManufacture = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập hạn sử dụng");
            int expiry = Integer.parseInt(scanner.nextLine());
            System.out.println("nhâp nguồn gốc");
            String origin = scanner.nextLine();
            System.out.println("nhập giá");
            float price = Float.parseFloat(scanner.nextLine());
            Fruit fruit1 = new Fruit(fruit.getNameFruit(),kindOfFruit,dateOfManufacture,expiry,origin,price);
            fruitRepository.edit(fruit1);
        }
    }
}
