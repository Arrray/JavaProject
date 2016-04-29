package basic.day05;

import java.util.Arrays;

/**
 * Created by array on 16-4-29.
 */
public class SortDemo1 {
    public static void main(String[] args){
        int[] ary = {8,2,3,7,1};
        ary = selectionSort(ary);
        System.out.println(Arrays.toString(ary));
    }

    /**
     * 选择排序
     * @param ary 将要排序的数组
     * @return 排序好的数组
     */
    private static int[] selectionSort(int[] ary) {
        for(int i=0;i<ary.length;i++){
            for(int j=i+1;j<ary.length;j++){
                if(ary[i]>ary[j]){
                    int tmp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = tmp;
                }
                System.out.println("第"+i+"轮排序"+Arrays.toString(ary));
            }
        }
        return ary;
    }
}
