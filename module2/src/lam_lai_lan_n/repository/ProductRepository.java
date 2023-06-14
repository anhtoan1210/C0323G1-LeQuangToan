package lam_lai_lan_n.repository;

import lam_lai_lan_n.common.ReadAndWrite;
import lam_lai_lan_n.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();
    private static final String PATH_PRODUCT = "src/lam_lai_lan_n/file.csv";

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
    public void addProduct(Product product) {
        List<String> strings = new ArrayList<>();
        strings.add(product.getCodeProduct() + "," + product.getNameProduct() + "," + product.getQuantity() + "," + product.getPince() + "," + product.getDescription());
        ReadAndWrite.writeFile(PATH_PRODUCT, strings, true);
    }

    @Override
    public Product getByCode(String code) {
        products = getAll();
        for (Product p : products) {
            if (p.getCodeProduct().equals(code)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void removeProduct(Product product) {
        products = getAll();
        products.remove(product);
        List<String> strings = new ArrayList<>();
        for (Product temp : products) {
            strings.add(temp.getCodeProduct() + "," + temp.getNameProduct() + "," + temp.getQuantity() + "," + temp.getPince() + "," + temp.getDescription());
        }
        ReadAndWrite.writeFile(PATH_PRODUCT, strings, false);
    }


}
