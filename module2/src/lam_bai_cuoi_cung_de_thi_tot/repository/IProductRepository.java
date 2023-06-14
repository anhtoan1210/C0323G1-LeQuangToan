package lam_bai_cuoi_cung_de_thi_tot.repository;

import lam_bai_cuoi_cung_de_thi_tot.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void add(Product product);

    void delete(Product product);

    Product getByID(String codeByID);

    void search(String name);
}
