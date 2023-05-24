package ss12.service;

import ss12.model.Product;
import ss12.repository.ProductRepository;

import java.util.*;

public class ProductService implements IProductService {
    private ProductRepository productRepository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Product> products = productRepository.getAll();
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    @Override
    public void add() {

        System.out.print("nhập id: ");
        String codeProduct = scanner.nextLine();
        System.out.print("nhập tên: ");
        String nameProduct = scanner.nextLine();
        System.out.print("nhập giá: ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.print("nhập số lượng: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mô tả sản phẩm: ");
        String description = scanner.nextLine();
        Product product = new Product(codeProduct, nameProduct, price, quantity, description);
        productRepository.addProduct(product);
        System.out.println("add oke");

    }

    @Override
    public void remove() {
        System.out.print("nhập id mà bạn muốn xoá: ");
        String id = scanner.nextLine();

        Product products = productRepository.getByID(id);

        if (products == null) {
            System.out.println("không tìm thấy: ");
        } else {
            productRepository.removeProduct(products);
            System.out.println("đã xoá thành công");
        }
    }

    public void edit() {
        System.out.println("nhập id sản phẩm mà bạn muốn sửa: ");
        String id = scanner.nextLine();
        int index = productRepository.getIndexById(id);
        Product products = productRepository.getByID(id);
        if (index == -1) {
            System.out.println("tìm không ra");
        } else {
            System.out.print("nhập tên: ");
            String nameProduct = scanner.nextLine();
            System.out.print("nhập giá: ");
            float price = Float.parseFloat(scanner.nextLine());
            System.out.print("nhập số lượng: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập mô tả sản phẩm: ");
            String description = scanner.nextLine();
            Product product = new Product(products.getCodeProduct(), nameProduct, price, quantity, description);
            productRepository.editProduct(index, product);

        }

    }

    public void search() {
        System.out.println("nhập tên sản phẩm cần tìm");
        String string = scanner.nextLine();
        List<Product> products = productRepository.searchName(string);
        for (Product p : products) {
            System.out.println(p);
        }

    }

    @Override
    public void sort() {
        List<Product> products = productRepository.getAll();
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice()>o2.getPrice()){
                    return 1;
                }
                return -1;
            }
        });
        List<Product>productListSort=productRepository.sortUpPrice(products);
        for (Product p:productListSort) {
            System.out.println(p);
        }
    }


}
