package goooooooooooooooood.service;

import goooooooooooooooood.model.Product;
import goooooooooooooooood.repository.IProductRepository;
import goooooooooooooooood.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static IProductRepository productRepository = new ProductRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAll() {
        List<Product> products = productRepository.getAll();
        for (Product p : products) {
            System.out.println(p);
        }

    }

    @Override
    public void addProduct() {
        System.out.println("nhập id");
        String id = scanner.nextLine();
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập số lương");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giá");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập mô ta");
        String description = scanner.nextLine();
        Product product = new Product(id, name, quantity, price, description);
        productRepository.addProduct(product);
        System.out.println("thêm mới thành công");

    }

    @Override
    public void deleteProduct() {
        System.out.println("nhập id sản phẩm m bạn muốn xoas");
        String id = scanner.nextLine();
        Product product = productRepository.getById(id);
        if (product == null) {
            System.out.println("không tìm thấy");
        } else {
            System.out.println("bạn có chắc chắn muốc xoá");
            System.out.println("1.có");
            System.out.println("2.không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                productRepository.deleteProduct(product);
                System.out.println("xoá oke");
            }
        }

    }

    @Override
    public void search() {
        System.out.println("nhập tên sản phẩm muốn tìm");
        String name = scanner.nextLine();
        productRepository.searchProduct(name);
    }
}
