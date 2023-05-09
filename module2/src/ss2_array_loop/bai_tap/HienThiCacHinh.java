package ss2_array_loop.bai_tap;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        for (int i = 7; i >=1 ; i--) {
            for (int j = 1; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}

