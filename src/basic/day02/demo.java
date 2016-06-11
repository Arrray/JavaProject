package basic.day02;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by array on 16-4-22.
 * @noinspection ALL
 */
public class demo {
    public static void main(String[] args){
        Random random = new Random();
        int r = random.nextInt(26);  //产生随机数[0,26]
        char c = (char)('A'+r);
        System.out.println(c);

        Scanner scanner = new Scanner(System.in);
        //从控制台接收一个数字
        double n = scanner.nextDouble();
        //处理
        n = Math.pow(n,2); //将从控制台得到的数平方
        System.out.println(n);
    }
}
