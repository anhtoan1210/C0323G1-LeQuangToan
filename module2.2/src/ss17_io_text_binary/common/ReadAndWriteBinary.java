package ss17_io_text_binary.common;

import ss17_io_text_binary.model.Spending;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBinary {
    public static List<Spending> readToFileBinary(String path) {
        List<Spending> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            stringList = (List<Spending>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static void writeFileBinary(String path, List<Spending> stringList) {
        File file = new File(path);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(stringList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {

        }
    }
}
