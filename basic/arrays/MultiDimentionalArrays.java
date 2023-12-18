package basic.arrays;

import java.util.Arrays;

public class MultiDimentionalArrays {

    public static void main(String[] args) {

        int[][] ar =new int[3][3];

        int[][] arr={
                {1 ,2, 3},
                {4,5,6},
                {7,8,9}
        };

        for(int row=0 ; row<arr.length; row++){                     // using for loop
            for(int col =0 ; col<arr[row].length; col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }

//        for(int[] a : arr){                                       // using foreach loop and toString method
//            System.out.println(Arrays.toString(a));
//        }
    }
}
