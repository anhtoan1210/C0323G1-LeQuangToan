package ss_11.bai_tap;

import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int num = 30;
        while (num != 0) {
            stack.push(num % 2);
            num = num / 2;
        }
        System.out.println(stack);
        int number = stack.size();
        for (int i = 0; i < number; i++) {
            System.out.print(+stack.pop());
        }
    }
}
