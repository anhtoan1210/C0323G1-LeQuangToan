package demo.bai_1;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product product, Product t1) {
        int result = product.getName().compareTo(t1.getName());
        if (result > 0) {
            return -2;
        } else if (result < 0) {
            return 2;
        } else {
            // nếu cùng tên thì so sánh theo giá
            return (int) (product.getPrice() - t1.getPrice());
        }
    }
}
