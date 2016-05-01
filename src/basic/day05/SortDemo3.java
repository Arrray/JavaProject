package basic.day05;

import java.util.Arrays;

/**
 * Created by Gaojunchao on 16/5/1.
 */
public class SortDemo3 {
    public static void main(String[] args) {
        int[] ary = {8, 2, 3, 7, 1};
        ary = insertSort2(ary);
        System.out.println(Arrays.toString(ary));
    }

    /**
     * 插入式排序
     */
    private static int[] insertSort2(int[] ary) {
        int i, j, t;
        for (i = 1; i < ary.length; i++) {
            t = ary[i];
            //利用循环查找插入位置:到头j=-1
            for (j=i-1; j>=0; j--)
                if (t < ary[j]) {
                    ary[j+1] = ary[j]; //[j]->[j+1]向后移动
                } else { // t不小于ary[j]
                    break; //找到插入位置:t不小于ary[j]
                }
            ary[j+1] = t; //插入t->[j+1]
        }
        return ary;
    }

}


