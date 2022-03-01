// 需求 任意给出一个数 用程序判断该整数是奇数还是偶数并且输出结果；
import java.util.Scanner;
public class 奇偶数案例 {
    public static void main(String[] args){
        System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        int zhengshu = scanner.nextInt();
        if (zhengshu % 2 ==  0){
            System.out.println("这个整数是偶数");
        } else {
            System.out.println("这个整数是奇数");
        }
    }
}
