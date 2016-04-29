package basic.day04;

import java.util.Arrays;

/**
 * Created by array on 16-4-29.
 */
public class CharCountDemo {
    public static void main(String[] args){
        String str = "统计一个字符在字符串中的所有位置";
        int[] ary = countAll(str,'字');
        System.out.println(Arrays.toString(ary));
    }

    /**
     * 统计一个字符在字符串中的所有位置的方法
     * @param str 被统计的字符串  str="统计字符在字符串中的位置"
     * @param ch 被统计字符  ch='字'
     * @return 数组，包含所有的位置
     */
    private static int[] countAll(String str, char ch) {
        int[] ary = {};
//        str.length()可以检查字符串的长度
        for(int i=0; i<str.length(); i++){  //i是每个字符串的位置
            char c = str.charAt(i);  //c 就是字符串中每个字符
            if (c==ch){  //找到被查找的字符
//                i->ary;将数组扩展，将i插入到数组中
                ary = Arrays.copyOf(ary,ary.length+1);
                ary[ary.length-1] = i;
            }
        }
        return ary;
    }
}
