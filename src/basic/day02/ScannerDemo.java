package basic.day02;

//import sun.tools.java.Scanner;
import java.util.Scanner;


/**
 * Created by Gaojunchao on 16/6/16.
 */
public class ScannerDemo {
    public static void main(String[] args){
        System.out.println("请输入一个整数:");
        Scanner scanner = new Scanner(System.in);
        //定义一个结果 = scanner控制台输入的下一个整形值
        int result = scanner.nextInt();
        //Scanner 输入一个字符串
        //定义一个str 字符串 = 控制台输入的下一行
        //String str = scanner.nextLine();
        //处理(打印)result
        //System.out.println(result);
        double str = Math.pow(result,2);
        System.out.println("输入的整数的平方为:"+str);
    }
}
