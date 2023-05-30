package ss17_io_binary_file_serialization.bai_tap_2;

import ss17_io_binary_file_serialization.bai_tap_1.model.Product;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn đường link muốn sao chép");
        String path = scanner.nextLine();
        List<Product> stringList = ReadAndWrite.readTofile(path);
        for (Product p : stringList) {
            System.out.println(p);
        }
        System.out.println("nhập đờng link muốn gửi tới");
        String pathG = scanner.nextLine();
        ReadAndWrite.writeListToFile(pathG, stringList);
        System.out.println("ok");
    }

}

