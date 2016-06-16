package basic.day02;

import java.util.Random;

/**
 * Created by Gaojunchao on 16/6/16.
 */
public class CharDemo {
    public static void main(String[] args){
        char c= 65;
        System.out.println(c);   //输出结果是A,程序语言是尽可能按照人的习惯输出
        System.out.println((int)c);   //65,输出的是一个数(强制类型转换)
        c = 20013;
        System.out.println(c);   //尽可能按照人的习惯输出
        System.out.println((int)c);   //200013

        c = 'A'+2;
        System.out.println(c);   //输出的是C, 67代表A,加2为C
        // import java.util.Random;
        Random random = new Random();
        int r = random.nextInt(26);   //产生随机数:[0,26),包含0,但不包含26(规则)
        c = (char)('A'+r);
        System.out.println(c);   //每运行一次程序,随机产生一个A-Z之间的数
        c = '8';   //字符8和数字8不同
        int m = c-'0';   //转换"数字字符"对应为"数字"
        System.out.println(m);   //8
        System.out.println((int)'0');   //48  "0"这个字符在电脑中的ASCII编码是48
        System.out.println((int)'1');   //49
        System.out.println((int)'2');   //50
        System.out.println((int)'3');   //51
        System.out.println((int)'4');   //'0'+4
        System.out.println((int)'5');   //'0'+5
        System.out.println((int)'6');   //'0'+6

//      如何将'c'->'C'
//      char c = 'c'-32;

        //关于转义字符

        c = '\'';   //\'转义表示为一个单引号

        //常用转义字符如下:  \"   \\   \n   \r   \u0000

        //不可见控制字符:如回车

        c = '\u0041';   //A
        c = '\u4e2d';   //中
        c = '\ufff0';
        System.out.println(c);

        c = '\u0000';   //编码是0的字符,也是一个不可见字符
                        //一般做为C++中字符串的结束字符,不是'0'

        System.out.println(c+'1');   //49  Windows下能输出,Linux下不能输出

        System.out.println(c+"1");   //注意:'1'和"1"是有区别的
    }
}
