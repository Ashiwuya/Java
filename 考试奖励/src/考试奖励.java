import java.util.Scanner;

public class 考试奖励 {
    public static void main(String[] args) {

        System.out.println("请输入小明的成绩 0-100");

       Scanner sc = new Scanner(System.in);
        int fenshu = sc.nextInt();
    /*    if (fenshu >= 95){
            System.out.println("自行车");
        } else if (fenshu >= 90){
            System.out.println("去游乐场");
        } else if (fenshu >= 80){
            System.out.println("变形金刚");
        }else {
            System.out.println("胖揍");
        } */

      if (fenshu > 100 || fenshu <0){
          System.out.println("输入的数据有误");
      } else if (fenshu >= 95){
          System.out.println("自行车");
      } else if (fenshu >= 90){
          System.out.println("去游乐场");
      } else if (fenshu >= 80){
          System.out.println("变形金刚");
      }else {
          System.out.println("胖揍");

        System.out.println("结束");
        }
    }
}
