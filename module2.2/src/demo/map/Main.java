package demo.map;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String args[]) {
        // init map
        Map<Integer, String> map = new TreeMap<>();
        map.put(100, "A");
        map.put(101, "B");
        map.put(102, "C");
        // show map
        for (Integer key:map.keySet()) {
            System.out.println("key"+key+","+map.get(key));
        }
        }
    }
