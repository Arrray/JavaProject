package basic.day02;
//整数类型演示
/**
 * Created by Gaojunchao on 16/6/14.
 */
public class IntegerDemo {
    public static void main(String[] args){

        //byte b = 128; 超出范围
        byte b = 127;
        byte c = -128;//11111111 11111111 11111111 10000000
        byte d = 0xffffff80; //-128

        /**
        整数字面量(直接量)默认是int类型,如果不超出范围,可以给小类型直接赋值.
        如:127 —— -128范围内的整数字面量可以赋值给byte变量,Java会自动的处理符号位
         */
//        byte e = 0x80; //编译错误,超范围
//        128 00000000 00000000 00000000 10000000
        short s = 32767;
//        short s2 = 0x8000; //错误,超范围
        short s2 = 0xffff8000;  //可以,最小值
        short s3 = -1;
        int i = s3;  //数据类型转换short->int 符号位扩展
        System.out.println(Integer.toBinaryString(i));  //32  1

        i = 0x7fffffff;

        long max = 0x7fffffffffffffffL;  //以1后缀为结尾
    }
}
