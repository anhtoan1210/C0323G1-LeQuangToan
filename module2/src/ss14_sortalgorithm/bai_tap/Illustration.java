package ss14_sortalgorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Illustration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập độ dài của mảng:");
        int lenght = Integer.parseInt(scanner.nextLine());
        int[] arrNum = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("nhập giá trị của phần tử: " + i);
            arrNum[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng trước khi xếp chèn: " + Arrays.toString(arrNum));
        insertionSort(arrNum);
        System.out.println("mảng sau khi sắp xếp: " + Arrays.toString(arrNum));
    }

    public static void insertionSort(int[] array) {
        int location;
        int value;
        for (int i = 1; i < array.length; i++) {
            value = array[i];//Lấy phần tu ra và so sánh và chèn
            location = i;    // con trỏ đến phần tử so sánh
            while (location > 0 && value < array[location - 1]) {
                //điều kiện để duyệt là location phải lớn hơn 0.tránh số âm.
                array[location] = array[location - 1];// đổi chỗ từ trái sang phải
                location--;
            }
            array[location] = value;//chèn giá trị vào
        }
    }
}

