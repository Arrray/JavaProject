package basic.day04;

/**
 * Created by array on 16-4-28.
 */
public class ForDemo_01 {
    public static void main(String[] args) {
        String bar = "6921168511280";
        boolean b = check(bar); //调用验证方法
        System.out.println(b);
    }
    public static boolean check(String ean13) {
        int sum1 = 0; //所有奇数位数字的和
        int sum2 = 0; //所有偶数位数字的和
//        char c = bar.charAt(0); //从字符串中取到字符‘6’
        for (int i = 0; i < 12; i += 2) {
            char c = ean13.charAt(i);
            sum1 += c - '0'; //奇数位字符转数字，累加
            sum2 += ean13.charAt(i + 1) - '0'; //偶数位字符转数字，累加
        }
        System.out.println("所有奇数位数字的和为：" + sum1 + ", 所有偶数位数字的和为：" + sum2); //输出累加的和

        int sum3 = sum1 + sum2 * 3; //将奇数位的和与偶数位和的三倍相加
        int sum4 = sum3 % 10; //对10取余（取到个位数）
        int code = (10 - sum4) % 10; //在取余（个位数）
        System.out.println("所得校验码为：" + code);

        int eanCode = ean13.charAt(12) - '0'; //传入字符串ean13的验证码

        if(code==eanCode){
            return true;
        }
        return false;

    }


}
