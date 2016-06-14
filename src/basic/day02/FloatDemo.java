package basic.day02;

/**
 * Created by Gaojunchao on 16/6/14.
 */
public class FloatDemo {
    public static void main(String[] args){
        int a = 0x7fffffff; //int类型最大值
        int b = 0x7ffffff0; //比a大15

        float fa = a;  //将int类型赋值给float
        float fb = b;  //将int赋值给float
        System.out.println(fa);
        System.out.println(fb);
        System.out.println(a==b);  //flase int类型的只相比a>b
        System.out.println(fa==fb);  //true  相同的数,float类型相比尽然相同

        //结论:浮点数没有int精确(尾数),浮点数范围比int大(指数)
        //int类型的范围是:2^31-1
        //float类型的范围是:2^(2^8)即2^256
        //double的精确度大于float

        double da = a;
        double db = b;
        System.out.println(da);
        System.out.println(da==db);  //flase
        System.out.println(da-db);  //15.0

        double d = 2.6;

        d = d - 2;  //浮点数运算是尽可能精确的运算
        System.out.println(d);  //结论:不要进行浮点数的精度比较

//        float f = 3.1415;  //编译错误,double不能赋值给float
        float f = 3.1415F;
        //注意如下表示的书类型不同1 1.0 1f 1d 1L
    }
}
