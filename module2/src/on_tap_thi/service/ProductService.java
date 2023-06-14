package on_tap_thi.service;

import on_tap_thi.model.Product;
import on_tap_thi.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductRepository productRepository = new ProductRepository();

    @Override
    public void displayAll() {
        List<Product> products = productRepository.getAll();
        for (Product p : products) {
            System.out.println(p);
        }

    }

    @Override
    public void addProduct() {
        //String codeProduct, String nameProduct, float price, int quantity, String description
        System.out.println("Nhập mã sản phẩm cần thêm ");
        String code = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("nhập giá sản phẩm");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập sô lượng sản phẩm");
        int quantily = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập mô tả sản phẩm");
        String description = scanner.nextLine();
        Product product = new Product(code, name, price, quantily, description);
        productRepository.addProduct(product);
        System.out.println("thêm mới quá thành công ");

    }

    @Override
    public void deleteProduct() {
        System.out.println("Bạn muốn xoa sản phẩm nào vui lòng nhập mã sản phẩm");
        String code = scanner.nextLine();
        Product product = productRepository.getByCode(code);
        if (product == null) {
            System.out.println("Không có sản phẩm");
        } else {
            System.out.println("Bạn có muốn xoá sản phẩm với tên" + product.getNameProduct());
            System.out.println("1.xoá");
            System.out.println("2. Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                productRepository.removeProduct(product);
                System.out.println("xoá thành công");
            }
        }
    }

}
