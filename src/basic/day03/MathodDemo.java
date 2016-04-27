package basic.day03;

import java.util.Scanner;

/**
 * Created by array on 16-4-27.
 */
//任务：
//实现一次函数计算
//y=f(x)=3x+6
public class MathodDemo {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        System.out.println("输入x");
        int x = console.nextInt();
        int y = f(x); //函数调用/方法调用
        System.out.println("f(x)=3x+6="+y);
    }
//    声明一个函数,在类中声明
//    返回值类型（值域）
//    参数int x ,x相当于自变量,int是x的定义域
    public static int f(int x1){
        int y = 3*x1+6; //y=3x+6
        return y; //return语句用户返回函数值,与返回值对应
    }
}
