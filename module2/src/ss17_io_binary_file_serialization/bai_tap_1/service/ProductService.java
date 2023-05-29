package ss17_io_binary_file_serialization.bai_tap_1.service;

import ss17_io_binary_file_serialization.bai_tap_1.model.Product;
import ss17_io_binary_file_serialization.bai_tap_1.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    private ProductRepository productRepository = new ProductRepository();

    @Override
    public void display() {
        List<Product> products = productRepository.getAll();
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    @Override
    public void add() {
        System.out.println("nhập id sản phẩm");
        String codeProduct = scanner.nextLine();
        System.out.println("nhập tên sản phẩm");
        String nameProduct = scanner.nextLine();
        System.out.println("nhập giá sản phẩm");
        String piceProduct = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất");
        String manufacturerProduct = scanner.nextLine();
        System.out.println("nhập mô tả");
        String describeProduct = scanner.nextLine();
        Product product = new Product(codeProduct, nameProduct, piceProduct, manufacturerProduct, describeProduct);
        productRepository.add(product);
    }

    @Override
    public void search() {
        System.out.println("Nhập tên sản phẩm cần tìm ");
        String name = scanner.nextLine();
        List<Product> products = productRepository.search(name);
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
