package thityDaysCode;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StacksQueues {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        StacksQueues p = new StacksQueues();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));

    }

    /**
     * In computer science, a queue is an abstract data type that represents a collection of elements in a linear order
     * where the main operations are to add elements to the back of the queue (enqueue)
     * and remove elements from the front of the queue (dequeue).
     * The elements in a queue are usually processed in a first-in, first-out (FIFO) order,
     * meaning that the element that was added first is the first one to be removed.
     * This makes the queue data structure useful for implementing algorithms that involve waiting for resources to become available,
     * such as job scheduling, task processing, or handling events.
     */
    Queue<Character> queue = new LinkedList<>();

    /**
     * In programming, a stack is a data structure that follows a last-in, first-out (LIFO) model and has two main operations:
     * push and pop
     * This data structure is used in a wide range of algorithms and programs, for example,
     * in the Depth First Search (DFS) algorithm to store the traversed path in a graph, a stack is used.
     */
    Stack<Character> stack = new Stack<>();

    private char dequeueCharacter() {
        return queue.remove();
    }

    private char popCharacter() {
        return stack.pop();
    }

    private void enqueueCharacter(char c) {
        queue.add(c);

    }

    private void pushCharacter(char c) {
        stack.push(c);

    }

}
