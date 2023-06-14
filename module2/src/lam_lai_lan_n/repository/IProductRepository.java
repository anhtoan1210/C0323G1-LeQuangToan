package lam_lai_lan_n.repository;

import lam_lai_lan_n.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void addProduct(Product product);

    Product getByCode(String code);

    void removeProduct(Product product);
}
