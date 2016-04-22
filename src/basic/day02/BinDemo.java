package basic.day02;

/**
 * Created by array on 16-4-22.
 */
public class BinDemo {
    public static void main(String[] args){
        int i=192;
        System.out.println(Integer.toBinaryString(i)); //输出2进制
        System.out.println(Integer.toHexString(i)); //输出16进制
        i=0xf4; //以0x或0x开头的为16进制
        System.out.println(i); //输出时默认转换为10进制
        System.out.println(Integer.toHexString(i)); //输出16进制
        i=072; //以0开头的为8进制
        System.out.println(i); //输出时默认转换为10进制
    }
}
