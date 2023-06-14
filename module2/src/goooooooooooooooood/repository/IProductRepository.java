package goooooooooooooooood.repository;

import goooooooooooooooood.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void addProduct(Product product);

    void deleteProduct(Product product);

    Product getById(String codeById);

    void searchProduct(String name);
}
