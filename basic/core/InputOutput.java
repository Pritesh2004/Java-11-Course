package basic.core;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);       //Object of scanner class

        //Program to  add two numbers
        System.out.println("Enter number a : ");
        int num1=input.nextInt();

        System.out.println("Enter number b : ");
        int num2 = input.nextInt();

        int add=num1+num2;
        System.out.println("Addition of a and b is : "+add);


    }
}
