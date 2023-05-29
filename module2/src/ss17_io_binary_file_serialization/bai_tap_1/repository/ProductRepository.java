package ss17_io_binary_file_serialization.bai_tap_1.repository;

import ss17_io_binary_file_serialization.bai_tap_1.comon.WriteAndReadFile;
import ss17_io_binary_file_serialization.bai_tap_1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String PRODUCT_LIST = "D:\\codegym\\module2\\src\\ss17_io_binary_file_serialization\\bai_tap\\untils\\product.dat";

    @Override
    public List<Product> getAll() {
        List<Product> productList = WriteAndReadFile.readProductFromFile(PRODUCT_LIST);
        return productList;
    }

    @Override
    public void add(Product product) {
        List<Product> productList = WriteAndReadFile.readProductFromFile(PRODUCT_LIST);
        productList.add(product);
        WriteAndReadFile.writeProductListToFile(PRODUCT_LIST, productList);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList = WriteAndReadFile.readProductFromFile(PRODUCT_LIST);
        List<Product>products=new ArrayList<>();
        for (Product p:productList) {
            if(p.getNameProduct().contains(name)){
                products.add(p);
            }
        }
        return products;
    }
}
