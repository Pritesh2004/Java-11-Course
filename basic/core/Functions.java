package basic.core;

import java.util.Scanner;

public class Functions {

    // Function to add two numbers
    public static int addition(int a, int b){
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter num2 : ");
        int num2 = input.nextInt();

        int result = addition(num1, num2);
        System.out.println("Addition of two numbers is "+result);
    }
}
