/*
            三个和尚
         需求 ： 一个寺庙住着三个和尚 ， 一直他们的身高为 一个150cm 一个210cm 一个165cm
         求出他们三个中升高最高的
 */
public class 三个和尚案例 {
    public static void main (String[] args){

        //定义三个和尚的身高（定义变量）
        int heshang1 = 150;
        int heshang2 = 210;
        int heshang3 = 165;

        //让和尚1 和 和尚2 进行比较 得出身高最高的 并且赋值给 （临时）保存为临时身高
        int linshi = heshang1 > heshang2 ? 150 : 210;

        //用刚刚比较出来的临时身高 和 和尚3 进行比较 得出升高最高的和尚
        int jieguo = linshi > heshang3 ? linshi : 165;

        //输出结果
        System.out.println( "身高最高的和尚的身高是："+jieguo);
    }
}
