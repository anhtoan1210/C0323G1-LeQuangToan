package lam_di_lam_lai.service;

import lam_di_lam_lai.model.Product;
import lam_di_lam_lai.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private ProductRepository productRepository = new ProductRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Product> products = productRepository.getAll();
        for (Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public void add() {
        System.out.println("nhập mã sản phẩm bạn muốn thêm");
        String id = scanner.nextLine();
        System.out.println("nhập tên sản phẩm bạn muốn thêm");
        String name = scanner.nextLine();
        System.out.println("nhập số lượng sản phẩm muốn thêm");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giá sản phẩm muốn thêm");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập mô tả sản phẩm muốn thêm");
        String description = scanner.nextLine();
        Product product1 = new Product(id, name, quantity, price, description);
        productRepository.add(product1);
        System.out.println("thêm mới thành công");
    }

    @Override
    public void delete() {
        System.out.println("nhập id mà bạn muốn xoá");
        String id = scanner.nextLine();
        Product product = productRepository.getById(id);
        if (product == null) {
            System.out.println("không tìm thấy sản phẩm muốn xoá");
        } else {
            System.out.println("Bạn c chắc chắn muốn xoá" + product.getNameProduct());
            System.out.println("1 Co");
            System.out.println("2 khong");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                productRepository.delete(product);
                System.out.println("Xoá thành công");
            }
        }
    }
}
