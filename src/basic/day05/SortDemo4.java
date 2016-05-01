package basic.day05;

import java.util.Arrays;

/**
 * Created by Gaojunchao on 16/5/1.
 */
public class SortDemo4 {
    public static void main(String[] args) {
        int[] ary = {8, 2, 3, 7, 1};
        ary = insertSort(ary);
        System.out.println(Arrays.toString(ary));
    }

    /**
     * 插入式排序
     */
    private static int[] insertSort(int[] ary) {
        int i, j, t;
        for (i = 1; i < ary.length; i++) {
            t = ary[i];
            //利用循环查找插入位置:到头j=-1
            for (j = i - 1; j >= 0 &&t<ary[j]; j--) {
                ary[j + 1] = ary[j]; //[j]->[j+1]向后移动
            }
            ary[j + 1] = t; //插入t->[j+1]
        }
        return ary;
    }
}
