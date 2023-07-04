package lam_mvc.repository;

import lam_mvc.common.ReadAndWrite;
import lam_mvc.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();
    private static final String PATH_PRODUCT = "src/lam_mvc/data/file.csv";

    @Override
    public List<Product> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_PRODUCT);
        products.clear();
        String[] info;
        for (String s : strings) {
            if (s != null && !s.equals("")) {
                info = s.split(",");
                products.add(new Product(info[0], info[1], Integer.parseInt(info[2]), Float.parseFloat(info[3]), info[4]));
            }
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
    public void delete(Product product) {
        products = getAll();
        products.remove(product);
        List<String> strings = new ArrayList<>();
        for (Product p : products) {
            strings.add(p.getCodeProduct() + "," + p.getNameProduct() + "," + p.getQuantity() + "," + p.getPrice() + "," + p.getDescription());
        }
        ReadAndWrite.writeFile(PATH_PRODUCT, strings, false);
    }

    @Override
    public Product getById(String codeById) {
        products = getAll();
        for (Product p : products) {
            if (p.getCodeProduct().equals(codeById)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void search(String name) {
        products = getAll();
        for (Product p : products) {
            if (p.getNameProduct().equals(name)) {
                System.out.println(p);
            }
        }
    }
}
