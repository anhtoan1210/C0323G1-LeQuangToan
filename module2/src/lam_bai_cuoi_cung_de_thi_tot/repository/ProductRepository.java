package lam_bai_cuoi_cung_de_thi_tot.repository;

import lam_bai_cuoi_cung_de_thi_tot.common.ReadAndFile;
import lam_bai_cuoi_cung_de_thi_tot.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();
    private static final String PATH_PRODUCT = "src/lam_bai_cuoi_cung_de_thi_tot/data/file.csv";

    @Override
    public List<Product> getAll() {
        List<String> strings = ReadAndFile.readFile(PATH_PRODUCT);
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
        ReadAndFile.writeFile(PATH_PRODUCT, strings, true);
    }

    @Override
    public void delete(Product product) {
        products = getAll();
        products.remove(product);
        List<String> strings = new ArrayList<>();
        for (Product p : products) {
            strings.add(p.getCodeProduct() + "," + p.getNameProduct() + "," + p.getQuantity() + "," + p.getPrice() + "," + p.getDescription());
        }
        ReadAndFile.writeFile(PATH_PRODUCT, strings, false);
    }

    @Override
    public Product getByID(String codeByID) {
        products = getAll();
        for (Product p : products) {
            if (p.getCodeProduct().equals(codeByID)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void search(String name) {
        products = getAll();
        for (Product p : products) {
            if (p.getNameProduct().contains(name)) {
                System.out.println(p);
            }
        }
    }
}
