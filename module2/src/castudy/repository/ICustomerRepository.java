package castudy.repository;

import castudy.model.person.Customer;
import castudy.model.person.Employee;

import java.util.List;

public interface ICustomerRepository extends IRepository {
    List<Customer> getAll();

    void addCustomer(Customer customer);

    void editCustomer(int index, Customer customer);

    void removeCustomer(int index);
}
