package ss6.point_and_moveablepoint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0, 0, 3, 5);
        Scanner scanner = new Scanner(System.in);

        movablePoint.move();
        System.out.println(movablePoint.toString());

    }
}
