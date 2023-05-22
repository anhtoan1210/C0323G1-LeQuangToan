package ss12.repository;

import ss12.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void addProduct(Product product);

    //    Product getByCode(String code);
    void removeProduct(Product product);

    Product getByID(String id);

    int getIndexById(String id);

    void editProduct(int index,Product product);
}
