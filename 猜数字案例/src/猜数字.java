//导包 输入数字；随机数字
import java.util.Random;
import java.util.Scanner;

public class 猜数字 {
    public static void main(String[] args){
        //生成一个随机数
        Random r = new Random();
        int n = r.nextInt(100) + 1;

        //创建输入数字
        while (true) {
        Scanner i = new Scanner(System.in);
        System.out.println("请输入你要猜的数字：");
        int c = i.nextInt();
        //用 if...else...if 语句比较猜的数字和随机数
            //如果 输入值c大于 随机值n 输出语句 "猜的数字大了"
        if (c > n) {
            System.out.println("猜的数字大了");
            //如果 输入值c小于 随机值n 输出语句 "猜的数字小了"
        } else if (c < n) {
            System.out.println("猜的数字小了");
            //如果上面两个语句为 false 输出语句 "恭喜你猜对了"
        } else {
            System.out.println("恭喜你猜对了");
            //强制结束while循环
            break;
            }
        }
    }
}
