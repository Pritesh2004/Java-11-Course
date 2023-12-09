package basic.core;

import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {

        //program to check whether the number is odd or even

        System.out.print("Enter a number : ");
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();

        //Condition to check whether the number is even or odd using IF-Else Statements.
        if(num%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }


        //program to print hello world 5 times

        int i = 0;
        while(i < 5){
            System.out.println("java.core.Hello World");
            i++;
        }
    }
}
