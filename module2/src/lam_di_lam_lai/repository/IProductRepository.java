package lam_di_lam_lai.repository;

import lam_di_lam_lai.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void add(Product product);

    Product getById(String codeById);

    void delete(Product product);
}
