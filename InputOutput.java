import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        //Program to  add two numbers
        System.out.println("Enter number a : ");
        Scanner a = new Scanner(System.in);       // code to input a field
        int num1=a.nextInt();

        System.out.println("Enter number b : ");
        Scanner b = new Scanner(System.in);
        int num2 = b.nextInt();

        int add=num1+num2;
        System.out.println("Addition of a and b is : "+add);


    }
}
