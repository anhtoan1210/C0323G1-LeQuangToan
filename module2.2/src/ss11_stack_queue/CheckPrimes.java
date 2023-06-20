package ss11_stack_queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPrimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập vào 1 số nguyên");
        int num = scanner.nextInt();
        CheckPrimes checkPrimes = new CheckPrimes();
        System.out.println(checkPrimes.integerStack(num));
        System.out.println(checkPrimes.integerQueue(num));
    }

    Stack<Integer> stack = new Stack<>();
    Queue<Integer> queue = new PriorityQueue<>();

    public Stack<Integer> integerStack(int number) {
        for (int i = 0; i < number; i++) {
            if (checkPrimes(i)) {
                stack.push(i);
            }
        }
        return stack;
    }

    public Queue<Integer> integerQueue(int number) {
        for (int i = 0; i < number; i++) {
            if (checkPrimes(i)) {
                queue.add(i);
            }

        }
        return queue;
    }

    public static boolean checkPrimes(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}

