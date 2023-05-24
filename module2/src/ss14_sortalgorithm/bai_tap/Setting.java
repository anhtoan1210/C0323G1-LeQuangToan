package ss14_sortalgorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Setting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập độ dài của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arrNum = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhập giá trị của tử" + i);
            arrNum[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng trước khi xếp chèn: " + Arrays.toString(arrNum));
        insertionSort(arrNum);
        System.out.println("mảng sau khi sắp xếp: " + Arrays.toString(arrNum));
    }

    public static void insertionSort(int[] array) {
        int pos;
        int value;
        for (int i = 1; i < array.length; i++) {
            value = array[i];
            pos = i;
            while (pos > 0 && value < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = value;
        }
    }
}