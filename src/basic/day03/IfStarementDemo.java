package basic.day03;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;
//if ...else  练习
//0杯不卖，一杯以上，第二杯半价
/**
 * Created by array on 16-4-27.
 */
public class IfStarementDemo {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("请输入购买数量：");
        int qty = console.nextInt(); //从控制台输入购买数量

        double price = 6.00; //产品单价
        double pay = 6.00; //准备付的钱（至少也是一杯的钱）
        if(qty<1){ //如果有人要半瓶，不卖！
            System.out.println("不卖！");
            return; //提前结束方法
        }
        if(qty == 1){ //如果有人要1瓶，6元
            System.out.println("支付金额："+pay);
        }
        if(qty>1){ //一杯以上，第二杯半价
            //pay = price + (qty-1)*price/2
            //相当于
            pay += (qty-1) * price/2;
            //相当于
            //pay = pay + (qty-1) * price/2;
            System.out.println("支付金额："+pay);
        }
        }
    }

