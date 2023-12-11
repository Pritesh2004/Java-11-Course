package basic.collections.lists;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruitList = new ArrayList<>();

        // Adding elements to the ArrayList
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Mango");

        // Displaying the elements in the ArrayList
        System.out.println("Fruits in the ArrayList:");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }

        // Accessing elements by index
        System.out.println("\nElement at index 2: " + fruitList.get(2));

        // Modifying an element
        fruitList.set(1, "Grapes");
        System.out.println("\nFruits after modifying the second element:");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }

        // Removing an element
        fruitList.remove("Orange");
        System.out.println("\nFruits after removing 'Orange':");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }

        // Checking if an element exists
        String searchFruit = "Banana";
        if (fruitList.contains(searchFruit)) {
            System.out.println("\n'" + searchFruit + "' is in the ArrayList.");
        } else {
            System.out.println("\n'" + searchFruit + "' is not in the ArrayList.");
        }

        // Size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + fruitList.size());

        // Clearing the ArrayList
        fruitList.clear();
        System.out.println("\nFruits after clearing the ArrayList:");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }
    }
}
