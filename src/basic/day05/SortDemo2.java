package basic.day05;

import java.util.Arrays;

/**
 * Created by array on 16-4-29.
 */
public class SortDemo2 {
    public static void main(String[] args){
        int[] ary = {8,2,3,7,1};
        ary = bubbleSort(ary);
        System.out.println(Arrays.toString(ary));
    }

    /**
     * 冒泡排序
     * @param ary 将要排序的数组
     * @return 排序好的数组
     */
    private static int[] bubbleSort(int[] ary) {
        for(int i=0;i<ary.length-1;i++){
            for(int j=0;j<ary.length-i-1;j++){
                //状态跟踪语句，状态=数据=当前变量的值
                //Debug：将跟踪的结果和理想的结果比较，找错误
                System.out.print(Arrays.toString(ary)+"\t");
                System.out.print(i+"\t");
                System.out.print(j+"\t");
                System.out.print(ary[j]+"\t");
                System.out.print(ary[j+1]+"\t");
                System.out.print((ary[j]>ary[j+1])+"\t");
                if(ary[j]>ary[j+1]){
                    System.out.print(ary[j]+"<->"+ary[j+1]);
                    int tmp = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = tmp;
                }
                System.out.println();
            }
        }
        return ary;
    }
}
