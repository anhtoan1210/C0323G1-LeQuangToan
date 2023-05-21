package ss_11.bai_tap;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println(stack);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println("các phần tử sau khi đảo ngược là" + stack);
        String str = "abcdefgh";
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack1.push(str.charAt(i));
        }
        System.out.println(stack1);
        String outp = "";
        for (int i = 0; i < str.length(); i++) {
            outp += stack1.pop();
        }
        System.out.println(outp);
    }
}
