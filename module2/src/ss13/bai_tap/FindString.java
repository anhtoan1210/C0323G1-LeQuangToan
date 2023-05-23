package ss13.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        System.out.println("nhập vào 1 chuỗi bất kì");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.println(ch);
        }
        System.out.println();

    }
}