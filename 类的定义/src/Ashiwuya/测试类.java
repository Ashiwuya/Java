package Ashiwuya;

public class 测试类 {
    public static void main(String[] args) {
        //创建对象
        Ashiwuya P = new Ashiwuya();
//      使用成员变量
        System.out.println(P.brand);
        System.out.println(P.price);
        //给成员变量赋值
        P.brand = "小米";
        P.price = 2999;
//      再次输出
        System.out.println(P.brand);
        System.out.println(P.price);
//        用用成员方法
        P.call();
        P.sme();
    }
}
