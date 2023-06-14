package lam_bai_cuoi_cung_de_thi_tot.service;

import lam_bai_cuoi_cung_de_thi_tot.model.Product;
import lam_bai_cuoi_cung_de_thi_tot.repository.IProductRepository;
import lam_bai_cuoi_cung_de_thi_tot.repository.ProductRepository;

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
    public void delete() {
        System.out.println("nhập id mà bạn muốn xoá");
        String id = scanner.nextLine();
        Product product = productRepository.getByID(id);
        if (product == null) {
            System.out.println("sản phẩm không tồn tại");
        } else {
            System.out.println("bạn c chắc chưa?");
            System.out.println("1.có");
            System.out.println("2.không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                productRepository.delete(product);
                System.out.println("xoá ok");
            }
        }

    }

    @Override
    public void add() {
        System.out.println("nhập id ");
        String id = scanner.nextLine();
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập sô lương");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập gias");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập mô tả");
        String description = scanner.nextLine();
        Product product = new Product(id, name, quantity, price, description);
        productRepository.add(product);
        System.out.println("thêm thành công");
    }

    @Override
    public void search() {
        System.out.println("nhập tên bạn mun tìm kiếm");
        String name = scanner.nextLine();
        productRepository.search(name);
    }
}
