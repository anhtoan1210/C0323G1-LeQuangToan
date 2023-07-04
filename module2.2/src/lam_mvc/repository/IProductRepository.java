package lam_mvc.repository;

import lam_mvc.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void add(Product product);

    void delete(Product product);

    Product getById(String codeById);

    void search(String name);
}
