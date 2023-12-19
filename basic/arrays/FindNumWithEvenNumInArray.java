package basic.arrays;

public class FindNumWithEvenNumInArray {

    public static void main(String[] args) {
        int[] arr={12, 345, 2, 6, 7896};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr) {
        int ans=0;
        for (int i = 0; i <arr.length ; i++) {
            if(evenNumDigits(arr[i])){
                ans++;
            }
        }
        return ans;
    }

    static boolean evenNumDigits(int num){
        String n = Integer.toString(num);
        if(n.length()%2 == 0){
            return true;
        }
        return false;
    }

}
