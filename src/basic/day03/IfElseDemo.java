package basic.day03;

/**
 * Created by array on 16-4-27.
 */
public class IfElseDemo {
    public static void main(String[] args){
        double base = 7.7/100; //基本年利率
        int years = 5; //贷款年限
        double rate = base; //实际利率
        if(years<=1){ //如果一年以内
            rate *= 0.5; //利率为5折
            //相当于 rate = rate * 0.5
        }else if(years<=3){ //如果三年以内
            rate *= 0.7; //利率为7折
        }else if(years<=5){ //如果5年以内
            rate = base; //原价
        }else { //5年以上
            rate *=1.1; //1.1倍
        }
        System.out.println("实际利率（%）："+rate);
    }
}