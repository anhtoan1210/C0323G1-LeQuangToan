package bai_lam_on_thi.service;

import bai_lam_on_thi.model.Product;
import bai_lam_on_thi.repository.ProductRepository;

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
        System.out.println("nhập id sản phẩm muốn thêm");
        String id = scanner.nextLine();
        System.out.println("nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập số lượng sản phẩm");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giá sản pẩm");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập mô tả sản phẩm");
        String description = scanner.nextLine();
        Product product = new Product(id, name, quantity, price, description);
        productRepository.add(product);
        System.out.println("Thêm sản phẩm quá thành công");
    }

    @Override
    public void delete() {
        System.out.println("mời bạn nhập id sản phẩm cần xoá");
        String id = scanner.nextLine();
        Product product = productRepository.getById(id);
        if (product == null) {
            System.out.println("không tìm thấy sản phẩm muốn xoá");
        } else {
            System.out.println("Bạn có chắc chắn muốn xoá " + product.getNameProduct());
            System.out.println("1.có");
            System.out.println("2.để suy nghĩ tí");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                productRepository.delete(product);
                System.out.println("xoá oke");
            }
        }
    }
}
