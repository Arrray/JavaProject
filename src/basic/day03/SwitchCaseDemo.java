package basic.day03;

/**
 * Created by array on 16-4-27.
 */
public class SwitchCaseDemo {
    public static void main(String[] args){
        int score = 88; //分数（100分满分）
        String level; //级别
        switch (score/10){ //只能是整数（int byte char short)表示
            case 10: //满分也是“优秀”，处理与case 9:相同
            case 9:level = "优秀"; //90~99
                break;
            case 8:level = "良好"; //80~89
                break;
            case 7:level = "中等"; //70~79
                break;
            case 6:level = "及格"; //60~69
                break;
            default:level = "不及格";
        }
        System.out.println(level);
    }
}

