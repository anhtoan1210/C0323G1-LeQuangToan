package demo.bai_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product(1, "Book", 2000);
        Product product2 = new Product(2, "Phone", 3000);
        Product product3 = new Product(3, "Television", 400);
        Product product4 = new Product(4, "Fan", 8);
        Product product5 = new Product(5, "Remote", 60);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        //comparable
        System.out.println("Trước khi sắp xếp");
        for (Product f : productList) {
            System.out.println(f);
        }
        System.out.println("Sau khi sắp xếp theo giá");
        Collections.sort(productList);
        for (Product p : productList) {
            System.out.println(p);
        }
        //comparable
        Collections.sort(productList, new SortByNameComparator());
        System.out.println("sau khi sắp xếp theo tên");
        for (Product p : productList) {
            System.out.println(p);
        }
    }
}

