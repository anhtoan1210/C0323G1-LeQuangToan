package castudy.repository;

import castudy.common.ReadAndWrite;
import castudy.model.peson.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private List<Employee> employees = new ArrayList<>();
    private static final String PATH_EMPLOYEE = "src/castudy/data/employee.csv";

    @Override
    public List<Employee> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_EMPLOYEE);
        employees.clear();
        String[] info;
        for (String s : strings) {
            info = s.split(",");
            //String id, String name, String dateOfBirth, String gender, String idCode,
            // String numberPhone, String email, String lerVer, String location, long wage) {
            employees.add(new Employee(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8], Long.parseLong(info[9])));
        }
        return employees;
    }

    @Override
    public void add(Employee employee) {
        List<String> strings = new ArrayList<>();
        strings.add(employee.getId() + "," + employee.getName() + "," + employee.getDateOfBirth() + "," + employee.getGender() + "," + employee.getIdCode() +
                "," + employee.getNumberPhone() + "," + employee.getEmail() + "," + employee.getLerVer() + "," + employee.getLocation() + "," + employee.getWage());
        ReadAndWrite.writeFile(PATH_EMPLOYEE, strings, true);
    }

    @Override
    public void delete(Employee employee) {
        employees = getAll();
        employees.remove(employee);
        List<String> strings = new ArrayList<>();
        for (Employee e : employees) {
            //String id, String name, String dateOfBirth, String gender, String idCode,
            // String numberPhone, String email, String lerVer, String location, long wage) {
            strings.add(e.getId() + "," + e.getName() + "," + e.getDateOfBirth() + "," + e.getGender() + "," +
                    e.getIdCode() + "," + e.getNumberPhone() + "," + e.getEmail() + "," + e.getLerVer() + "," + e.getLocation() + "," + e.getWage());
        }
        ReadAndWrite.writeFile(PATH_EMPLOYEE, strings, false);
    }

    @Override
    public void edit(int index, Employee employee) {
        List<String> strings = ReadAndWrite.readFile(PATH_EMPLOYEE);
        strings.set(index, employee.getId() + "," + employee.getName() + "," + employee.getDateOfBirth() + "," + employee.getGender() + "," + employee.getIdCode() + "," + employee.getNumberPhone() + "," + employee.getEmail() + "," + employee.getLerVer() + "," + employee.getLocation() + "," + employee.getWage());
        ReadAndWrite.writeFile(PATH_EMPLOYEE, strings, false);
    }

    @Override
    public Employee getById(String codeById) {
        employees = getAll();
        for (Employee e : employees) {
            if (e.getId().equals(codeById)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Employee> search(String name) {
        employees = getAll();
        List<Employee> employees1 = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getName().contains(name)) {
                employees1.add(e);
            }
        }
        return employees1;
    }
}
