package basic.core;

public class Constructor {

    static int noOfUser = 10; // static variable
    String name;
    String email;
    String password;

    public Constructor(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

}
