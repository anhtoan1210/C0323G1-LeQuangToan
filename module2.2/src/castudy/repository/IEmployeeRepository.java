package castudy.repository;

import castudy.model.peson.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getAll();

    void add(Employee employee);

    void delete(Employee employee);

    void edit(int index, Employee employee);

    Employee getById(String codeById);

    List<Employee> search(String name);
}
