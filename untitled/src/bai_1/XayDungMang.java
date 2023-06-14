package bai_1;

public class XayDungMang {
    public static void main(String[] args) {
        int[] arrB = {1, 2, 3};
        int tongA = 0;
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = tongA;
            for (int j = 0; j < i; j++) {
                arrB[i] += arrB[j];
            }
        }
    }
}
