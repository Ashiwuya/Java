import java.util.Scanner;

public class 减肥计划 {
    public static void main(String[] args) {
        //键盘录入一个星期数，用一个变量接受
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数");
        int week = sc.nextInt();

        //if循环输出每天任务
        if (week < 1 || week > 7) {
            System.out.println("您输入的信息有误");
        } else if (week == 1){
            System.out.println("跑步");
        }else  if ( week ==2){
            System.out.println("慢走");
        }else if (week == 3){
            System.out.println("动感单车");
        }else if (week == 4){
            System.out.println("拳击");
        }else if (week == 5){
            System.out.println("游泳");
        }else if (week == 6){
            System.out.println("爬山");
        }else {
            System.out.println("好好吃一顿");
        }
    }
}
