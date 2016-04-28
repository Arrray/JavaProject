package basic.day03;

import java.util.Scanner;

/**
 * Created by array on 16-4-27.
 */
public class WhileDemo {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int qty;
        while (true){
            System.out.print("输入购买数量：");
            qty = console.nextInt();
            if(qty>0 && qty<=5){ //五个以内
                break; //打断当前循环
            }
            System.out.println("购买数量：1~5");
        }
        System.out.println("数量："+qty);
    }
}
