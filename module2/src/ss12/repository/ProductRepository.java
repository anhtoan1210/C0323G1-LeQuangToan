package ss12.repository;

import ss12.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("1", "thuốc lá", 15000, 10, "thuốc lá hại  phổi"));
        products.add(new Product("2", "kẹo", 300000, 10, "ngon ngọt"));
        products.add(new Product("3", "dầu ăn", 30000, 10, "trơn mượt "));
        products.add(new Product("4", "bia huda", 250000, 10, "vị ban đầu hơi đắng," +
                "uống nhiều hoá ngọt"));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public Product getByID(String id) {
        for (Product p : products
        ) {
            if (p.getCodeProduct().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public int getIndexById(String id) {
        for (Product p : products) {
            if (p.getCodeProduct().equals(id)) {
                return products.indexOf(p);
            }
        }
        return -1;
    }

    @Override
    public void editProduct(int index, Product product) {
        products.set(index, product);
    }

    @Override
    public List<Product> searchName(String name) {
        List<Product> productListSearch = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getNameProduct().contains(name)) {
                productListSearch.add(products.get(i));

            }
        }
        return productListSearch;
    }

    @Override
    public List<Product> sortUpPrice(List<Product> productList) {
        return productList;
    }


}
