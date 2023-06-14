package bai_lam_on_thi.repository;

import bai_lam_on_thi.common.ReadAndWrite;
import bai_lam_on_thi.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();
    private static final String PATH_PRODUCT = "src/bai_lam_on_thi/file.csv";

    @Override
    public List<Product> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_PRODUCT);
        products.clear();
        String[] info;
        for (String s : strings) {
            info = s.split(",");
            products.add(new Product(info[0], info[1], Integer.parseInt(info[2]), Float.parseFloat(info[3]), info[4]));
        }
        return products;
    }

    @Override
    public void add(Product product) {
        List<String> strings = new ArrayList<>();
        strings.add(product.getCodeProduct() + "," + product.getNameProduct() + "," + product.getQuantity() + "," + product.getPrice() + "," + product.getDescription());
        ReadAndWrite.writeFile(PATH_PRODUCT, strings, true);
    }

    @Override
    public Product getById(String codeById) {
        products = getAll();
        for (Product product : products) {
            if (product.getCodeProduct().equals(codeById)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void delete(Product product) {
        products = getAll();
        products.remove(product);
        List<String> strings = new ArrayList<>();
        for (Product p : products) {
            strings.add(p.getCodeProduct() + "," + p.getNameProduct() + "," + p.getQuantity() + "," + p.getPrice() + "," + p.getDescription());
        }
        ReadAndWrite.writeFile(PATH_PRODUCT, strings, false);
    }
}
