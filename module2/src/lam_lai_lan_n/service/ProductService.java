package lam_lai_lan_n.service;

import lam_lai_lan_n.model.Product;
import lam_lai_lan_n.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    ProductRepository productRepository = new ProductRepository();


    @Override
    public void display() {
        List<Product> products = productRepository.getAll();
        for (Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public void addProduct() {
        System.out.println("nhập mã sản phẩm muốn thêm");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm muốn thêm");
        String name = scanner.nextLine();
        System.out.println("Nhập số lượng sản phẩm muốn thêm");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giá sản phẩm muốn thêm");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập mô tả sản phẩm");
        String description = scanner.nextLine();
        Product product = new Product(id, name, quantity, price, description);
        productRepository.addProduct(product);
        System.out.println("thêm mới quá thành công");
    }

    @Override
    public void removeProduct() {
        System.out.println("bạn muốn xoá sản phẩm nào .vui lòng nhập mã sản phẩm");
        String code = scanner.nextLine();
        Product product = productRepository.getByCode(code);
        if (product == null) {
            System.out.println("không có sản phẩm cần xoá");
        } else {
            System.out.println("bạn có muốn xoá sản phẩm với tên" + product.getNameProduct());
            System.out.println("1.xoá");
            System.out.println("2.không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                productRepository.removeProduct(product);
                System.out.println("xoá thành công");
            }
        }
    }
}
