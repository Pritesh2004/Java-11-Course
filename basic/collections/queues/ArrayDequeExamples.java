package basic.collections.queues;

import java.util.ArrayDeque;

public class ArrayDequeExamples {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Adding elements to the front of the deque
        arrayDeque.addFirst("One");
        arrayDeque.addFirst("Two");
        arrayDeque.addFirst("Three");

        // Adding elements to the end of the deque
        arrayDeque.addLast("Four");
        arrayDeque.addLast("Five");

        // Displaying the elements in the deque
        System.out.println("ArrayDeque elements: " + arrayDeque);

        // Removing elements from the front and end of the deque
        String firstElement = arrayDeque.removeFirst();
        String lastElement = arrayDeque.removeLast();

        // Displaying the elements after removal
        System.out.println("Removed first element: " + firstElement);
        System.out.println("Removed last element: " + lastElement);
        System.out.println("ArrayDeque elements after removal: " + arrayDeque);
    }
}
