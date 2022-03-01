public class 赋值运算符 {
    public static void main(String[] args){
        //把10赋值给int类型的变量i
        int i = 10;
        System.out.println("i:" +i );

        //+= 把左边和右边的的数据做加法操作，结果赋值给左边
        //i += 20;
        i = i + 20;
        System.out.println("i:" +i);

        //注意！！！ :扩展的赋值运算符底层隐含了强制类型转换  += 中隐含了强制类型转换
        short s = 10;
        //s += 20;    可以出结果为： s:30
        //s = s + 20;   不能出结果，报错 类型需要转换
        //s = (short)(s + 20); 可以出结果 int类型的20强转为short类型
        //建议使用+=方法(简洁明了）
        s += 20;
        System.out.println("s:" + s);
    }
}
