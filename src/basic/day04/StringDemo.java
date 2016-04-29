package basic.day04;

import java.util.Arrays;

/**
 * Created by array on 16-4-28.
 */
public class StringDemo {
    public static void main(String[] args){
        String s = "a173b12";
        char ch = s.charAt(2);
        int a = ch - '0'; //char转int
        System.out.println(a); //7(int)

    }
//    public static void main(String[] args){
//        int[] arr = {1,2,3,4};
//        int[] dest = Arrays.copyOf(arr,arr.length);
//        System.out.println(Arrays.toString(dest));
//    }
}
