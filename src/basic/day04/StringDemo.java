package basic.day04;

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
}
