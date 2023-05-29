package ss17_io_binary_file_serialization.bai_tap_1.repository;

import ss17_io_binary_file_serialization.bai_tap_1.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();
    void add(Product product);
    List<Product> search(String name);
}
