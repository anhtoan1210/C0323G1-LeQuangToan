package ss_11.bai_tap;

import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int a = 30;
        while (a != 0) {
            stack.push(a % 2);
            a = a / 2;
        }
        System.out.println(stack);
        int b = stack.size();
        for (int i = 0; i < b; i++) {
            System.out.print(+stack.pop());
        }
    }
}
