package yessssssssss.repository;

import yessssssssss.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void add(Product product);

    Product getById(String codeByID);

    void delete(Product product);
}
