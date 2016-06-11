package basic.day04.homework;

import java.util.Arrays;

/**
 * Created by JUN-CHAO on 2016/6/1.
 */
public class test01 {
    public static void main(String[] args){
        char key = '字';
        String str = "统计一个字符在字符串中的所有位置";
        int [] arr = count(str ,key);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] count(String str, char key) {
        int [] count = {};
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (c==key){
                //扩展数组
                count = Arrays.copyOf(count,count.length+1);
                //添加序号i
                count[count.length-1] = i;
            }
        }
        return count;
    }
}
