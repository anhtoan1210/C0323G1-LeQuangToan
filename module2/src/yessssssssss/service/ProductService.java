package yessssssssss.service;

import yessssssssss.common.ReadAndWrite;
import yessssssssss.model.Product;
import yessssssssss.repository.ProductRepository;

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
    public void addProduct() {
        System.out.println("nhập id sản phẩm mà bạn muốn thêm");
        String id = scanner.nextLine();
        System.out.println("nhập");
        String name = scanner.nextLine();
        System.out.println("nhập số lượng");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giá");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập mô tả");
        String description = scanner.nextLine();
        Product product = new Product(id, name, quantity, price, description);
        productRepository.add(product);
        System.out.println("thêm mới thành công");

    }

    @Override
    public void deleteProduct() {
        System.out.println("nhâp id sản phẩm mà bạn muốn xoá");
        String id = scanner.nextLine();
        Product product = productRepository.getById(id);
        if (product == null) {
            System.out.println("không tìm thấy");
        } else {
            System.out.println("bạn có chắc chắn muốn xoá sản phẩm với tên" + product.getNameProduct());
            System.out.println("1.co\n" +
                    "2.không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                productRepository.delete(product);
                System.out.println("xoá thành công");
            }
        }

    }
}
