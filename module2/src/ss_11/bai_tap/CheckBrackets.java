package ss_11.bai_tap;

import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String string = "s*(s-a)*(s-b)*(s-c)";
        String[] array = string.split("");
        boolean check = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("(")) {
                stack.push(array[i]);
            }
            if (array[i].equals(")")) {
                if (stack.isEmpty()) {
                    check = false;
                    break;
                }
                if (stack.pop() == array[i]) {
                    check = false;
                    break;
                }
            }
        }
        if (stack.isEmpty() && check) {
            System.out.println("well");
        } else {
            System.out.println("???");
        }
    }
}
