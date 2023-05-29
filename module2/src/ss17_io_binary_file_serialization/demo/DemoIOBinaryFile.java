package ss17_io_binary_file_serialization.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DemoIOBinaryFile {
    private static final String CUSTOMER_LIST_PATH = "src/ss17_io_binary_file_serialization/demo\\cusstumer.dat";

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer(1, "Toản", "@gmail.com");
        Customer customer2 = new Customer(2, "lâm", "@gmail.com");
        Customer customer3 = new Customer(3, "quý", "@gmail.com");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        writeCustomerListToFile(customerList, CUSTOMER_LIST_PATH);
        List<Customer> customersListFromFile = readCustomerFromFile(CUSTOMER_LIST_PATH);
        for (Customer c : customersListFromFile) {
            System.out.println(c);
        }
    }

    private static void writeCustomerListToFile(List<Customer> customerList, String Path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(Path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(customerList);//ghi vào file
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Customer> readCustomerFromFile(String path) {
        List<Customer> customerList = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            customerList = (List<Customer>) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }


}

