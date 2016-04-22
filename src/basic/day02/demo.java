package basic.day02;

import java.util.Random;

/**
 * Created by array on 16-4-22.
 */
public class demo {
    public static void main(String[] args){
        Random random = new Random();
        int r = random.nextInt(26);  //产生随机数[0,26]
        char c = (char)('A'+r);
        System.out.println(c);
    }
}
