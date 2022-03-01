import java.util.Scanner;

public class 春夏秋冬 {
    public static void main(String[] args){
        System.out.println("开始");

        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();

        switch (week){
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.printf("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.printf("秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.printf("冬天");
                break;
            default:
                System.out.println("输入的月份有误");
        }
        System.out.println("结束");
    }
}
