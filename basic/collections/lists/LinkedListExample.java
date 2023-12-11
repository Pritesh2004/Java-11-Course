package basic.collections.lists;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");

        // Displaying the LinkedList
        System.out.println("Original LinkedList: " + linkedList);

        // Adding elements at specific positions
        linkedList.add(2, "Grape");
        linkedList.addFirst("Avocado");
        linkedList.addLast("Fig");

        // Displaying the modified LinkedList
        System.out.println("Modified LinkedList: " + linkedList);

        // Removing elements
        linkedList.remove("Banana");
        linkedList.removeFirst();
        linkedList.removeLast();

        // Displaying the final state of the LinkedList
        System.out.println("Final LinkedList: " + linkedList);

        // Accessing elements using index
        System.out.println("Element at index 1: " + linkedList.get(1));

        // Checking if an element exists
        System.out.println("Contains 'Cherry': " + linkedList.contains("Cherry"));
    }
}
