package basic.lamdasAndStream.lambda;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Without lamda
        Greetings greetings =new Greetings() {
            @Override
            public void sayHello() {
                System.out.println("Hello world");
            }
        };
        greetings.sayHello();

        // With lamda
        Greetings greeting1 = () -> System.out.println("Hello world");
        greeting1.sayHello();


        //Example of lamda expression
        Calculator cal = (int a, int b) -> {
            Random num = new Random();
            int randomNumber = num.nextInt(100);

            return a*b+randomNumber;
        };
        System.out.println(cal.calculate(2,5));
    }
}
