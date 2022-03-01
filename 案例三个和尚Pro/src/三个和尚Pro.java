/*
            寺庙里的三个和尚 他们的身高必须经过测量得出
            求出他们的 最高身高
 */
//导包
import java.util.Scanner ;
public class 三个和尚Pro {
    public static void main (String[] args){
        //创建对象
        Scanner sc = new Scanner(System.in);
        //接收数据
        System.out.println("请输入第一个和尚的身高");
        int heshang1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高");
        int heshang2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高");
        int heshang3 = sc.nextInt();
        //进行比较
        int linshi = heshang1 > heshang2 ? heshang1 : heshang2 ;
        int jieguo = linshi > heshang3 ? linshi : heshang3 ;
        //输出结果
        System.out.println("最高的身高是：" + linshi + "CM");
    }
}
