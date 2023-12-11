package basic.objectOriented.Abstraction;

public class Implementation implements Contract{

    @Override
    public void hello(){
        System.out.println("Hello world");
    }


    public static void main(String[] args) {

        String text= "My name is pritesh";

        Contract local = new Implementation();

        local.hello();


    }
}
