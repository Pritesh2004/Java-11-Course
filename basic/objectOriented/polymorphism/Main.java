package basic.objectOriented.polymorphism;

public class Main extends User{

    public Main(String name, String email, String role) {
        super(name, email, role);
    }
    public Main(String name) {
        super(name);
    }

    @Override                                            // runtime polymorphism
    public void isEligible(){
        if(this.getName()=="Pritesh"){
            System.out.println("User is Pritesh");
        }
    }


    public static void main(String[] args) {
        User newUser = new User("Priteh", "pritesh123@gmail.com","Admin");

        User newUserName = new User("Harsh");         // compile-time polymorphism
        newUser.isEligible();

    }
}
