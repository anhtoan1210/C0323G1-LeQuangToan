package bai_2;

public class SearchMaxEndMin {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("phần tử lớn nhất " + max);
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println("Phần tử nhỏ nhất " + min);

    }
}
