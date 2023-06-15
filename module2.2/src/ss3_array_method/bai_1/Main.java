package ss3_array_method.bai_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8,8};
        System.out.println("Nhập số nguyên : ");
        int number = Integer.parseInt(scanner.nextLine());
        boolean checkNumber = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
               index =i;
                checkNumber =true;
            } else {
                checkNumber =false;
            }
        }
        if(checkNumber==true){
            System.out.println("vị trí number xuất hiện trong mảng là: "+index);
        }else {
            System.out.println("Không tồn tại");
            System.out.println(Arrays.toString(arr));
        }
    }
}
