package ss_11.bai_tap;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountFrom {
    public static void main(String[] args) {
        String str = "Le Quang Toan";
        Map<String, Integer> map = new TreeMap<>();
        String[] strings = str.toLowerCase().split("");
        for (String s : strings) {
            int count = 0;
            if (s.equals("")) {
                continue;
            }
            for (String i : strings) {
                if (s.equals(i)) {
                    count++;
                }
            }
            map.put(s, count);
        }
        Set<String> key = map.keySet();
        for (String k:key) {
            System.out.println("từ khoá "+k+" giá trị "+ map.get(k));
        }
    }
}