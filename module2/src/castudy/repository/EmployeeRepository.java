package castudy.repository;

import castudy.common.ReadAndWrite;
import castudy.model.person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employees = new ArrayList<>();
    private static final String PATH_PRODUCT = "src/castudy/data/employee.csv";

    @Override
    public List<Employee> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_PRODUCT);
        employees.clear();
        String[] info;
        for (String str : strings) {
            info = str.split(",");
            employees.add(new Employee(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8], Long.valueOf(info[9])));
        }
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> strings = new ArrayList<>();
        strings.add(employee.getName() + "," + employee.getEmail() + "," + employee.getPhoneNumber() + ","
                + employee.getIdCode() + "," + employee.getGender() + "," + employee.getDateOfBirth() + ","
                + employee.getLerver() + "," + employee.getLocation() + "," + employee.getId() + ","
                + employee.getWage());
        ReadAndWrite.writeFile(PATH_PRODUCT, strings, true);
    }

    @Override
    public Employee getById(String id) {
        employees = getAll();
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void removeEmployee(int index) {
        //  public void removeStudent(int index) {
        //        List<Student>studentList = ReadAndWriteStudent.readTFileStudent("src/bai_lam_them/data/student.csv");
        //        studentList.remove(index);
        //        ReadAndWriteStudent.writeToFile("src/bai_lam_them/data/student.csv",studentList);
        //    }
        List<String> employeeList = ReadAndWrite.readFile(PATH_PRODUCT);
        employeeList.remove(index);
        ReadAndWrite.writeFile(PATH_PRODUCT, employeeList, false);
    }


    @Override
    public void editEmployee(int index, Employee employee) {
        List<String> strings = ReadAndWrite.readFile(PATH_PRODUCT);
        strings.set(index, employee.getId() + "," + employee.getEmail() + "," + employee.getPhoneNumber() + ","
                + employee.getIdCode() + "," + employee.getGender() + "," + employee.getDateOfBirth() + ","
                + employee.getLerver() + "," + employee.getLocation() + "," + employee.getName() + ","
                + employee.getWage());
        ReadAndWrite.writeFile(PATH_PRODUCT, strings, false);
    }

    @Override
    public List<Employee> employeeList(String name) {
        List<String> strings = ReadAndWrite.readFile(PATH_PRODUCT);
        List<Employee> employeeList = new ArrayList<>();
        employees.clear();
        String[] info;
        for (String str : strings) {
            info = str.split(",");
            employees.add(new Employee(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8], Long.valueOf(info[9])));
        }
        for (Employee e : employees) {
            if (e.getName().contains(name)) {
                employeeList.add(e);
            }
        }
        return employeeList;
    }


}
