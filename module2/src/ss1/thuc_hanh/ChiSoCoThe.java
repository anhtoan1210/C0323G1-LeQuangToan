package ss1.thuc_hanh;

import java.util.Scanner;

public class ChiSoCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("you weight(in kilogam):");
        weight = Double.parseDouble(scanner.nextLine());
        System.out.println("your height(in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("bmi");
        if (bmi < 18) {
            System.out.println("Underweight" + bmi);
        } else if (bmi < 25) {
            System.out.println("Normal" + bmi);
        } else if (bmi < 30) {
            System.out.println("Overweight" + bmi);
        } else {
            System.out.println("obese" + bmi);
        }
    }
}

