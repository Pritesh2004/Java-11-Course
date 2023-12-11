package basic.collections;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // List Example
        Collection<String> listOfNames = new ArrayList<>();

        // Adding elements to the list
        listOfNames.add("Alice");
        listOfNames.add("Bob");
        listOfNames.add("Charlie");
        listOfNames.add("David");

        // Iterating through the list
        System.out.println("List of Names:");
        for (String name : listOfNames) {
            System.out.println(name);
        }

        // Map Example
        Map<Integer, String> studentMap = new HashMap<>();

        // Adding elements to the map
        studentMap.put(101, "John");
        studentMap.put(102, "Emily");
        studentMap.put(103, "Alex");
        studentMap.put(104, "Sophia");

        // Iterating through the map
        System.out.println("\nMap of Students:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
