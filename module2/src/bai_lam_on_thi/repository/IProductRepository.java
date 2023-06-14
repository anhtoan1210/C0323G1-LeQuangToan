package bai_lam_on_thi.repository;

import bai_lam_on_thi.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void add(Product product);

    Product getById(String codeById);

    void delete(Product product);
}
