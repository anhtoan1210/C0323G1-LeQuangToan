package lam_thuat_toan.bai_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findCommonCharacters {
    public static void main(String[] args) {
        int count = 0;
        String str = "Abcdef1234";
        String string = "Abcdef1234";
        String[] a = str.split("");
        String[] b = string.split("");
        List<String> arr = new ArrayList<>();
        List<String> array = new ArrayList<>();
        arr.addAll(Arrays.asList(a));
        array.addAll(Arrays.asList(b));
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < array.size(); j++) {
                if (arr.get(i).equals(array.get(j))) {
                    count++;
                    array.remove(j);
                    break;
                }
            }
        }
        System.out.println(count);

    }
}
