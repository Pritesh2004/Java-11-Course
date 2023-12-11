package basic.collections.sets;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of integers
        TreeSet<Integer> numberSet = new TreeSet<>();

        // Adding elements to the TreeSet
        numberSet.add(5);
        numberSet.add(2);
        numberSet.add(8);
        numberSet.add(1);
        numberSet.add(6);

        // Displaying the TreeSet elements
        System.out.println("TreeSet Elements: " + numberSet);

        // Operations on TreeSet
        System.out.println("Size of TreeSet: " + numberSet.size());
        System.out.println("First Element: " + numberSet.first());
        System.out.println("Last Element: " + numberSet.last());

        // Removing an element
        numberSet.remove(2);
        System.out.println("TreeSet after removing 2: " + numberSet);

        // Checking if an element is present
        int elementToCheck = 5;
        System.out.println("Is " + elementToCheck + " present? " + numberSet.contains(elementToCheck));

        // Iterating through the TreeSet
        System.out.println("Iterating through TreeSet:");
        for (Integer num : numberSet) {
            System.out.println(num);
        }

        // Clearing the TreeSet
        numberSet.clear();
        System.out.println("TreeSet after clearing: " + numberSet);
    }
}
