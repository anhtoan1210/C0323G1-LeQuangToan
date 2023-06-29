package castudy.repository;

import castudy.common.ReadAndWrite;
import castudy.model.peson.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customers = new ArrayList<>();
    private static final String PATH_CUSTOMER = "src/castudy/data/customer.csv";

    @Override
    public List<Customer> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_CUSTOMER);
        customers.clear();
        String[] info;
        for (String s : strings) {
            if (s != null && !s.equals("")) {
                info = s.split(",");
                customers.add(new Customer(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]));
            }
        }
        return customers;
    }

    @Override
    public void add(Customer customer) {
        List<String> strings = new ArrayList<>();
        //String id, String name, String dateOfBirth, String gender, String idCode,
        // String numberPhone, String email, String address, String customerLevel)
        strings.add(customer.getId() + "," + customer.getName() + "," + customer.getDateOfBirth() + ","
                + customer.getGender() + "," + customer.getIdCode() + "," + customer.getNumberPhone() +
                "," + customer.getEmail() + "," + customer.getAddress() + "," + customer.getCustomerLevel());
        ReadAndWrite.writeFile(PATH_CUSTOMER, strings, true);
    }

    @Override
    public void delete(Customer customer) {
        customers = getAll();
        customers.remove(customer);
        List<String> strings = new ArrayList<>();
        for (Customer c : customers) {
            strings.add(c.getId() + "," + c.getName() + "," + c.getDateOfBirth() + "," + c.getGender() + "," + c.getIdCode() + "," +
                    c.getNumberPhone() + "," + c.getEmail() + "," + c.getAddress() + "," + c.getCustomerLevel());
        }
        ReadAndWrite.writeFile(PATH_CUSTOMER, strings, false);
    }

    @Override
    public List<Customer> search(String name) {
        customers = getAll();
        List<Customer> customerList = new ArrayList<>();
        for (Customer c : customers) {
            if (c.getName().contains(name)) {
                customerList.add(c);
            }
        }
        return customerList;
    }

    @Override
    public void edit(int index, Customer customer) {
        List<String> strings = ReadAndWrite.readFile(PATH_CUSTOMER);
        //  //String id, String name, String dateOfBirth, String gender, String idCode,
        //        // String numberPhone, String email, String address, String customerLevel)
        strings.set(index, customer.getId() + "," + customer.getName() + "," + customer.getDateOfBirth() + "," + customer.getGender() + "," + customer.getIdCode() + "," + customer.getNumberPhone() + "," + customer.getEmail() + "," + customer.getAddress() + "," + customer.getCustomerLevel());
        ReadAndWrite.writeFile(PATH_CUSTOMER, strings, false);
    }

    @Override
    public Customer getByID(String getCodeById) {
        customers = getAll();
        for (Customer c : customers) {
            if (c.getId().equals(getCodeById)) {
                return c;
            }
        }
        return null;
    }
}
