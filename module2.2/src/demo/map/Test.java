package demo.map;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Toản");
        map.put(3, "Thôi");
        map.put(2, "Lâm");
        map.put(4, "Vương");
        // duyệt theo Entry!
        for (Map.Entry<Integer, String> stringEntry : map.entrySet()) {
            System.out.println(stringEntry.getKey() + "," + stringEntry.getValue());
        }
    }
}
