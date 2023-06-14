package okecomonbaby.repository;

import okecomonbaby.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void add(Product product);

    Product getById(String codeById);

    void delete(Product product);
}
