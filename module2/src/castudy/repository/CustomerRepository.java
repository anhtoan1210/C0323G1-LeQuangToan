package castudy.repository;

import castudy.common.ReadAndWrite;
import castudy.model.person.Customer;
import castudy.model.person.Employee;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customers = new ArrayList<>();
    private static final String PATH_PRODUCT = "src/castudy/data/customer.csv";

    @Override
    public List<Customer> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_PRODUCT);
        customers.clear();
        String[] info;
        for (String str : strings) {
            info = str.split(",");
            customers.add(new Customer(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]));
        }
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> strings = new ArrayList<>();
        //String id, String name, String dateOfBirth, String gender,
        // String idCode, String phoneNumber, String email, String address, String customerLevel
        strings.add(customer.getId() + "," + customer.getName() + "," + customer.getDateOfBirth() + "," + customer.getGender() + "," + customer.getIdCode() + "," + customer.getPhoneNumber() + "," + customer.getEmail() + "," + customer.getAddress() + "," + customer.getCustomerLevel());
        ReadAndWrite.writeFile(PATH_PRODUCT, strings, true);
    }

    @Override
    public void editCustomer(int index, Customer customer) {
        List<String> strings = ReadAndWrite.readFile(PATH_PRODUCT);
        //String id, String name, String dateOfBirth, String gender, String idCode, String phoneNumber,
        // String email, String address, String customerLevel
        strings.set(index, customer.getId() + "," + customer.getName() + "," + customer.getDateOfBirth() + "," + customer.getGender() + "," +
                customer.getIdCode() + "," + customer.getPhoneNumber() + "," + customer.getEmail() + "," + customer.getAddress() + "," + customer.getCustomerLevel());
        ReadAndWrite.writeFile(PATH_PRODUCT, strings, false);
    }

    @Override
    public void removeCustomer(int index) {
        List<String> customerList = ReadAndWrite.readFile(PATH_PRODUCT);
        customerList.remove(index);
        ReadAndWrite.writeFile(PATH_PRODUCT, customerList, false);
    }
}
