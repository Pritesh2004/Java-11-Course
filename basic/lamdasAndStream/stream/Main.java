package basic.lamdasAndStream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Integer[] scores =new Integer[]{10,58,37,78,93};
        Stream<Integer> scoresStream = Arrays.stream(scores);
        scoresStream
                .sorted()                                        // sort the array in ascending orderr
                .filter(s-> s.equals(37))
                .forEach(s -> System.out.println(s));            // loop through each element of the array


        List<String> shoppingList =new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("milk");
        shoppingList.add("pasta");
        Stream<String> shoppingListStream = shoppingList.stream(); // creating new stream of shopping list.
        shoppingListStream
                .sorted()
                .map(item -> item.toUpperCase())                // convert to upper case & changes to new string object
                .filter(item -> item.startsWith("B"))           // filter the list to print string starting with B
                .forEach(item -> System.out.println(item));

    }
}
