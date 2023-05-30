package ss17_io_binary_file_serialization.bai_tap_2;

import ss17_io_binary_file_serialization.bai_tap_1.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite implements Serializable {
    public static void writeListToFile(String path, List<Product> stringList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(stringList);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("s");
            ;
        }

    }

    public static List<Product> readTofile(String path) {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("sao chép file");
            System.out.printf(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }
}

