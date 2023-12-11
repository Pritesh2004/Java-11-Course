package basic.collections.sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> fruitSet = new HashSet<>();

        // Adding elements to the HashSet
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        fruitSet.add("Mango");
        fruitSet.add("Apple"); // Duplicate elements are not allowed

        // Displaying the elements of the HashSet
        System.out.println("HashSet elements: " + fruitSet);

        // Size of the HashSet
        System.out.println("Size of HashSet: " + fruitSet.size());

        // Removing an element
        fruitSet.remove("Banana");
        System.out.println("HashSet after removing 'Banana': " + fruitSet);

        // Checking if an element is present
        System.out.println("Is 'Mango' present in the HashSet? " + fruitSet.contains("Mango"));

        // Iterating through the HashSet using an iterator
        System.out.println("Iterating through the HashSet:");
        Iterator<String> iterator = fruitSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clearing the HashSet
        fruitSet.clear();
        System.out.println("HashSet after clearing: " + fruitSet);
    }
}
