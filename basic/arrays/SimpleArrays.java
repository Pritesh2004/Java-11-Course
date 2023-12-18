package basic.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArrays {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int[] arr=new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }


//        for(int i=0; i<arr.length; i++){                           // using for loop
//            System.out.print(arr[i]);
//        }

//      System.out.print(Arrays.toString(arr));                    //using toString method

        for(int a: arr){                                           // using foreach loop
           System.out.print(a);
        }

    }
}
