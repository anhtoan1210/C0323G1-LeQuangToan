package castudy.repository;

import castudy.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository {
    List<Employee> getAll();

    void addEmployee(Employee employee);

    void editEmployee(int index,Employee employee);
}
