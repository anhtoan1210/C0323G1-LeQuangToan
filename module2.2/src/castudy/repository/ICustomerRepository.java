package castudy.repository;

import castudy.model.peson.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();

    void add(Customer customer);

    void delete(Customer customer);

    List<Customer> search(String name);

    void edit(int index, Customer customer);

    Customer getByID(String getCodeById);
}
