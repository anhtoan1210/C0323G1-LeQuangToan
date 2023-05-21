package ss_11.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckString {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> stringQueue = new LinkedList<>();
        String str = "Able was I ere I saw elbA";
        String[] work = str.split("");
        for (int i = 0; i < work.length; i++) {
            stack.push(work[i]);
            stringQueue.add(work[i]);
        }
        int count = 0;
        for (int i = 0; i < work.length; i++) {
            if (stack.pop().equals(stringQueue.poll())) ;
            count++;
        }
        if (count == work.length) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }
}
