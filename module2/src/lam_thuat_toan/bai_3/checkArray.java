package lam_thuat_toan.bai_3;

public class checkArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 9};
        System.out.println(check(arr));
    }

    public static boolean check(int[] arr) {

        for (int i = 1; i < arr.length - 1; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                sum2 += arr[j];
            }
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;

    }
}
