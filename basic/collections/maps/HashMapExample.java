package basic.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> studentAgeMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        studentAgeMap.put("Alice", 22);
        studentAgeMap.put("Bob", 25);
        studentAgeMap.put("Charlie", 20);
        studentAgeMap.put("David", 23);

        // Accessing values using keys
        System.out.println("Age of Alice: " + studentAgeMap.get("Alice"));
        System.out.println("Age of Bob: " + studentAgeMap.get("Bob"));

        // Checking if a key is present
        String searchKey = "Charlie";
        if (studentAgeMap.containsKey(searchKey)) {
            System.out.println(searchKey + " is present in the HashMap. Age: " + studentAgeMap.get(searchKey));
        } else {
            System.out.println(searchKey + " is not present in the HashMap.");
        }

        // Iterating through the HashMap
        System.out.println("\nStudent Ages:");
        for (Map.Entry<String, Integer> entry : studentAgeMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Removing a key-value pair
        String removeKey = "Bob";
        studentAgeMap.remove(removeKey);
        System.out.println("\nAfter removing " + removeKey + ":");
        for (Map.Entry<String, Integer> entry : studentAgeMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}
