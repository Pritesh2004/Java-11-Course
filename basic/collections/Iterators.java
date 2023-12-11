package basic.collections;

import basic.objectOriented.polymorphism.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Iterators {

    public static void main(String[] args) {

        User user1 =new User("Pritesh","pritesh123@gmail.com","pritesh123");
        User user2 =new User("Harsh","harsh123@gmail.com","harsh123");
        User user3 =new User("Viraj","viraj123@gmail.com","viraj123");

        Collection<User> users = new ArrayList<>(Arrays.asList(user1,user2,user3));

        //using iterators traversing through the list
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()){
            User user =  iterator.next();
            System.out.println(user.getName());

        }

        //Using for each loop
        for (User userr:users) {
            System.out.println(userr.getEmail());
        }

    }
}
