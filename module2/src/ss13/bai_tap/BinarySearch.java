package ss13.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 4, 3, 6, 7, 2, 5, 8, 9};
        Arrays.sort(ints);
        System.out.println("nhập vào 1 số cần tìm");
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println( search(ints, 0, ints.length - 1, x));
    }

    public static int search(int[] array, int left, int right, int value) {

        int mid = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (value == array[mid]) {
            return mid;
        } else if (value < array[mid]) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
        return search(array, left, right, value);
    }

}
