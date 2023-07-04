package lam_mvc.service;

import lam_mvc.model.Product;
import lam_mvc.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static ProductRepository productRepository = new ProductRepository();

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Product> products = productRepository.getAll();
        for (Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public void add() {
        System.out.println("nhap");
        String id = scanner.nextLine();
        System.out.println("nhap ");
        String name = scanner.nextLine();
        System.out.println("nhap");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("nhap");
        String description = scanner.nextLine();
        Product product = new Product(id, name, quantity, price, description);
        productRepository.add(product);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void delete() {
        System.out.println("Nhập id mà bạn muốn xoá");
        String id = scanner.nextLine();
        Product product = productRepository.getById(id);
        if (product == null) {
            System.out.println("id không tồn tại");
        } else {
            System.out.println("bạn có chắc chưa");
            System.out.println("1.có");
            System.out.println("2. chưa");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                productRepository.delete(product);
                System.out.println("xoá oke");
            }
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập tên mà bạn muốn tìm kiếm");
        String name = scanner.nextLine();
        productRepository.search(name);
    }
}
