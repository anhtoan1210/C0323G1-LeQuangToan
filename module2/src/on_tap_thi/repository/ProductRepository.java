package on_tap_thi.repository;

import on_tap_thi.common.ReadAndWrite;
import on_tap_thi.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();
    private static final String PATH_PRODUCT = "src/on_tap_thi/data/file.csv";

    @Override
    public List<Product> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_PRODUCT);
        products.clear();
        String[] info;
        for (String s : strings) {
            info = s.split(",");
            products.add(new Product(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), info[4]));
        }
        return products;
    }

    @Override
    public void addProduct(Product product) {
        List<String> strings = new ArrayList<>();
        strings.add(product.getCodeProduct() + "," + product.getNameProduct() + "," + product.getPrice() + ","
                + product.getQuantity() + "," + product.getDescription());
        ReadAndWrite.writeFile(PATH_PRODUCT, true, strings);
    }

    @Override
    public Product getByCode(String code) {
        products = getAll();
        for (Product product : products) {
            if (product.getCodeProduct().equals(code)) {
                return product;
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
            strings.add(temp.getCodeProduct() + "," + temp.getNameProduct() + "," + temp.getPrice() + "," + temp.getQuantity() + "," + temp.getDescription());
        }
        ReadAndWrite.writeFile(PATH_PRODUCT, false, strings);
    }
}
